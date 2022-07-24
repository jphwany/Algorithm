/*
    Q) 문자열을 요소로 갖는 배열을 입력받아 가장 짧은 문자열과 가장 긴 문자열을 제거한 배열을 리턴

    input args_1 : String 타입의 배열 arr, arr[i].length()는 20이하
    output : 배열

    [caution]
    가장 짧은 문자열의 길이와 가장 긴 문자열의 길이가 같은 경우는 없다
    가장 짧은 문자열 or 가장 긴 문자열이 다수일 때 나중에 위치한 문자열을 제거
    공백을 입력받을 경우 null 반환

 */

package removeExtreames;

public class SolutionRemoveExtremes {
    public String[] removeExtremes(String[] arr){

        /*
           입력받는 String 타입의 arr 배열을 반복해 순회해서
           그 안에 String 타입의 요소들 중에 가장 짧은 문자열과 긴 문자열을 찾는다
           찾는 건 길이로 찾는다

           찾았으면 그걸 새로운 배열에 할당을 해서 리턴
           대신
           같은 길이의 중복된 것들이 있다면 가장 뒤에 있는 요소들 기준으로 제거를 해야한다
           반복문은 앞에서부터 차례대로 순회를 하니까 조건문 자체를 같거나 큰 대소관계로써 나타내면
           뒤에있는 요소를 가져온다

         */

        // 입력받는 배열 길이가 0이면 null 리턴
        if(arr.length == 0) return null;

        // 가장 짧은 길이의 문자열 초기화
        int minLength = 20;
        // 20으로 설정한 이유는 문제에서 최대 길이가 20이라고 언급을 했고
        // 비교해가며 작은 값을 반복하며 찾기 위해선 최대 길이여야만 한다

        // 가장 짧은 길이의 문자열의 번지수를 나타내는 index 변수 선언
        int minIndex = 0;

        // 가장 긴 길이의 문자열 초기화
        int maxLength = 0;

        // 가장 긴 길이의 문자열의 번지수를 나타내는 index 변수 선언
        int maxIndex = 0;

        // 가장 짧은 것 긴 것을 제거한 결과 값 배열 선언
        String[] result = new String[arr.length -2]; // 2개를 지웠으니 배열 길이는 기존 길이의 -2 길이

        // 문자열 배열을 반복 순회
        for(int i = 0; i < arr.length; i++){
            // 주어진 문자열 배열의 i번째 요소 길이가 만약 minLength 와 같거나 작으면 minLength 에 i번째 문자열 배열 길이를 넣음
            if(arr[i].length() <= minLength){
                minLength = arr[i].length();
                // 반복하면서 보다 더 작은 애를 계속 minLength 에 집어넣으니까, 결국 가장 작은 길이의 minLength 가 나올 것
                // 만약 "aaa", "aaaa", "aaaaaa" 라고하면 초기에 20이라고 잡아둔 minLength와 저 문자열들을 비교
                // 1. "aaa"가 길이 3인데 3이라는 수가 minLength에 저장되고, minIndex에 i번째에 해당하는 값을 저장
                // 2. minLength에 저장된 3과 증가된 i번째의 길이, "aaaa" 길이 4와 비교
                // 3. if 조건문이 성립 안하기 때문에 minIndex에 집어넣지 않음, 이게 반복
                // 4. 결국 제일 길이가 짧은 것이 minIndex에 저장됨

                // minIndex가 필요한 이유, 그 가장 작은 길이의 minLength 가 i번째라고 했을 때
                // i번째에 해당하는 그 가장 작은 값을 minIndex 라는 변수에 할당해야한다
                // 결과 값의 배열에 활용할 minIndex가 없으면 반복문을 돌린 의미가 없기 때문이다
                minIndex = i;
            }
            if(arr[i].length() >= maxLength){
                maxLength = arr[i].length();
                // 반복하면서 보다 더 큰 애를 계속 maxLength 에 집어넣으니까 (0으로 초기화해줬으니)
                // 결국 가장 긴 길이의 maxLength 가 나올 것
                // 가장 긴 길이의 maxLength가 i번째, 거기에 maxIndex 변수에 할당
                maxIndex = i;
            }
        }

        // 결과 값 배열에 가장 짧고 긴 2가지 요소를 제외하고 다른 나머지 요소들을 반복 순회하며 할당
        // 반복자는 다르니까 j도 따로 선언
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            // i번째에 해당하는 값들이 가장 길이가 길거나 짧은 요소가 아닐 때 전부 새로운 결과값에 할당
            // 그러면 결과값 배열에는 가장 길이가 긴, 짧은 2가지 요소가 없는 채로 할당되니까
            // 결국 문제의 요구사항인, 가장 길이가 길고 짧은 문자열을 제거하라는 것과 같은 결과가 나타나게 된다

            // 하지만 문제 조건, 문자열 길이가 가장 길고 짧은 요소가 중복되는 경우에 가장 나중 요소를 제거해야 한다고 했다
            // 이건 아래의 if 조건문을 보면 자연스럽게 해결된다. 애초에 가장 나중 요소를 "삭제"하는 개념이 아니라
            // minIndex와 maxIndex 자체를 전부 걸러서 새로운 결과 값 배열에 할당하는 것이기 때문에 문제가 되지 않는다
            if(i != minIndex && i != maxIndex){
                result[j] = arr[i];
                j++;
            }
        }

        return result;
    }
}
