/*
    Q) 문자열을 요소로 갖는 배열을 입력받아 문자열을 세로로 읽었을 때의 문자열을 리턴

    input args_1 : arr, String 타입을 요소로 갖는 배열
    output : String 타입

    [caution]
    1. 문자열 길이는 다양
    2. 각 문자의 위치를 행, 열로 나타낼 경우, 비어있는 행,열은 무시

 */

package readVertically;

public class SolutionReadVertically {
    public String readVertically(String[] arr){

        // 가장 긴 문자열 초기화
        int maxLength = 0;

        // 결과 담을 변수 StringBuilder로 선언
        StringBuilder result = new StringBuilder();

        // 가장 긴 문자열 반복문으로 뽑아서 할당
        for(int i = 0; i < arr.length; i++){
            maxLength = Math.max(maxLength, arr[i].length()); // Math.max로 값 비교해서 큰 값 추출
        }

        // 배열 문자열 접근 반복문, 문자열의 문자 요소 접근 반복문
        // 바깥 반복문이 1번 반복될 때 안쪽 반복문은 전부 반복된다 그리고 바깥 반복문이 1 증가하는 구조
        for(int i = 0; i < maxLength; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[j].length() > i){
                    result.append(arr[j].charAt(i));
                }
            }
        }
        return result.toString();
    }
}

/*
    문자열을 요소로 갖는 배열에서 그 문자열을 세로로 읽었을 때 문자열을 리턴
	문자열의 글자 하나 하나를 뽑아서 세로로 읽는 것 처럼
    각 문자열의 글자 위치대로 하나씩 나열해서 붙인다

    배열의 문자열에 접근하는 반복문과 그 문자열의 문자 요소에 접근하는 반복문이 필요

    예를 들어
    "hello",
    "world"
    라는 입력 예시가 있다고 하면

    hello라는 문자열 요소에 접근해서 h를 뽑고, world에서 w를 뽑아야 한다
    그리고 다시 hello에 접근해 e를 뽑고, world로 넘어가 o를 뽑는다
    다시 hello에 접근, l을
    world에 접근, r을
    . . .
    그러니까 문자열의 문자 요소 0번째 1번째 3번째 차례대로 뽑아와야 하는거니까
    바깥 반복문의 반복자 i로 설정해주고 charAt(i)로 안쪽 반복문에서 계속 뽑는 로직을 써야한다
    왜냐하면 문자열 요소를 검색을 해도 결국 그 문자열에 문자 요소의 n번째를 동일하게 뽑아야 하기 때문에 크게 반복하려면 이렇게 하는게 좋다

    이중 반복을 통해 이걸 표현할 수 있는데

    for(int i = 0; i < maxLength; i++){
        for(int j = 0; j < arr.length; j++){
            if(arr[j].length() > i){
                result.append(arr[j].charAt(i));
                }
            }
        }

    가장 길이가 긴 문자열 요소 만큼 반복 (문자열 요소를 순회해야 하니까 가장 긴 문자열 요소를 기준으로 반복하는 것)
    그러는 동시에 배열의 길이 만큼 반복하며 순회를 할 때
    문자열에 접근한 j번째 요소의 길이가 바깥 반복문의 i보다 클 때, 해당 문자열의 문자 요소에 접근해서 뽑는다
    j가 증가한 상태로 또 위의 로직을 반복, 대신에 i는 아직 증가하지 않았다 j가 전부 반복이 끝나야 비로소 i가 증가하며 전체 반복이 진행되기 때문



 */
