/*
    Q)배열을 입력받아 순서가 뒤집힌 배열을 리턴
    input args_1 : arr (int 타입의 요소를 갖는 배열)
    output : 순서가 뒤집힌 배열

    [caution]
    1. 메소드는 재귀함수 형태로 작성
    2. 반복문 사용 금지
    3. 입력 받은 배열은 메소드 호출뒤에도 처음 상태 유지
    4. 빈 배열은 빈 배열 그대로 리턴

 */


package reverseArr;

import java.util.Arrays;

public class SolutionReverseArr {
    public int[] reverseArr(int[] arr){

        // 빈 배열은 빈 배열 그대로 리턴
        if(arr.length == 0) return arr;
        // 브레이크 포인트
        // 재귀 하다가 빈 배열까지 해버리면 여기서 끝

        /*
           순서가 뒤집힌 배열을 재귀로 호출하기 위해서는
           요소 하나 하나를 배열 마지막 요소로 밀어넣으면 된다
        */

        // 배열 첫번째 요소를 가장 마지막으로 보내고 (head)
        int[] head = new int []{arr[arr.length -1]};

        // 보내고 남은 나머지 부분 (tail) => 여기서 재귀 호출
        // tail 부분을 다시 재귀, head와 tail로 나누고 계속 반복
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1));

        // head와 tail을 합칠 result 배열 선언
        int[] result = new int [head.length + tail.length];

        // 복사하는 방식, 덮어쓰는 방식으로 result 완성
        System.arraycopy(head, 0, result, 0, head.length);
        System.arraycopy(tail, 0, result, 1, tail.length);

        return result;
    }
}
