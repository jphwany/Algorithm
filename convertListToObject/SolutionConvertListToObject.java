/*
    Q) 2차원 배열(배열을 요소로 갖는 배열)을 입력받아 각 배열을 이용해 만든 HashMap 리턴

    input args : 배열을 요소로 갖는 배열 arr
                 arr[i]는 String 타입을 요소로 갖는 배열
                 arr[i].length는 0 또는 2
                 String arr;

    output : arr[i]의 첫 번째 요소를 키, 두 번째 요소를 값으로 하는 HashMap<String, String> 리턴

    [caution]
    1. 중복되는 키의 경우, 초기 값 사용
    2. 빈 배열 입력받은 경우, 빈 HashMap 리턴
    3. arr[i] 길이 0인 경우 무시

*/
package convertListToObject;

import java.util.HashMap;

public class SolutionConvertListToObject {
    public HashMap<String, String> convertListToHashMap(String[][] arr){


        // 리턴할 HashMap 선언
        HashMap<String, String> result = new HashMap<>();

        // 빈 배열 입력받을 경우 빈 HashMap 리턴
        if(arr.length == 0){
            return result;
        }

        // 입력받은 배열을 반복하며 HashMap에 put 하는 과정
        for(int i = 0; i < arr.length; i++){
            // HashMap 생성할 때 필요한 조건
            // 2차원 배열안에 배열 요소가 하나라도 비어있으면 무시, 중복되는 키의 경우 초기 값 사용
            // 반복문 안에 위의 조건이 전부 들어가야 하기 때문에 이중 조건문 사용
            if(arr[i].length == 2){
                // 만약 arr[i].length != 0 이라고 한다면 0 외의 2말고 다른 숫자도 들어갈 수 있기 때문에
                // arr[i].length == 2가 조금 더 클린한 코드일 수 있다

                // HashMap 검색을 해서 키의 값이 중복이 되는지 확인
                if(!result.containsKey(arr[i][0])){ // HashMap에 i번째의 0번째, 키가 존재하지 않는다면
                    result.put(arr[i][0], arr[i][1]); // 차례대로 키와 벨류를 집어넣음
                }
            }
        }
            return result;
    }
}
/*
    입력받는 2차원 배열을 첫번째 요소 키, 두번째 요소 값으로 하는 String 타입 HashMap 리턴
    배열 길이는 0 or 2 -> 빈 배열이거나 키와 값 2개 요소를 가지는 것
    중복 키는 초기 값 사용, arr[i] 길이가 0인 경우 무시
    => 2차원 배열은 배열을 요소로 가지는 배열이기 때문에 하나만 비어있을 경우도 존재한다
    그러니까 그 한 행이 비어있는 경우를 arr[i] 길이가 0인 경우로 표시한 것 같다
    HashMap은 키와 값을 쌍으로 가지고 있기 때문에 2차원 배열 안에 배열이 하나가 비어있다면
    온전히 HashMap을 완성시킬 수 없을테니 그 로직은 무시하라는 것과 같다
      [
        [],
        ["key1", "value1"]
      ]
    arr[i].length == 0 , 여기서 i가 0이면 인덱스 0에 접근했을 때 arr[0] 요소가 없기 때문에
    HashMap에 put하는 상황을 스킵하라는 말
*/
