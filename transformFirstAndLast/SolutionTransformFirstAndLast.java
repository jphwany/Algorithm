/*
    Q) 배열을 입력받아서 차례대로 배열 첫 요소, 마지막요소를 키와 값으로 하는 HashMap 리턴

    input) args_1 : arr(String 타입을 요소로 가지는 배열)
    output) HashMap<String, String> 타입 리턴

    [caution]
    1. 빈 배열을 입력받을 경우 null 리턴
    2. 입력으로 받는 배열은 수정하지 않아야함

*/
import java.util.*;
public class SolutionTransformFirstAndLast {
    public HashMap<String, String> transformFirstAndLast(String[] arr){
        // 빈 배열 입력받을 경우 null 리턴
        if(arr.length == 0){
            return null;
        }
        // 리턴할 HashMap 선언
        HashMap<String, String> map = new HashMap<>();

        // key1에 배열 0번째요소 할당
        // value1에 배열 마지막 요소 할당 (arr.length -1 은 전체 배열 길이에서 바로 이전이니까 마지막요소이다)
        String key1 = arr[0];
        String value1 = arr[arr.length-1];

        // 선언해놓은 HashMap에 배열 요소 할당해놓은 key1, value1을 put
        map.put(key1, value1);

        return map;
    }
}