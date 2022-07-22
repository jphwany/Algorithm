/*
    Q) 문자열을 입력받아 연속된 한자리 홀수 숫자 사이에 '-'를 추가한 문자열을 리턴
    input args_1 : str, String 타입의 숫자 문자열
    output : String 타입

    [caution]
    0은 짝수로 간주
 */



package insertDash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SolutionInsertDash {
    public String insertDash(String str){

        if(str.length() == 0){
            return null;
        }

        String[] arr = new String[str.length()];
            for(int i = 0; i < arr.length; i++){
                arr[i] = String.valueOf(str.charAt(i));
    }           // ex) "7567"  =>  ["7","5","6","7"]

//  List<String> list = new ArrayList<>(List.of(arr));
    List<String> list = new ArrayList<>(Arrays.asList(arr));
		for(int i = 1; i < list.size(); i++){
            if((Integer.parseInt(list.get(i-1)) % 2 != 0) && (Integer.parseInt(list.get(i)) % 2 != 0)){
                list.add(i, "-");
                i++;
                // i번째에 -를 넣으면 뒤로 한 칸씩 밀려서 그 다음을 확인하려고 보면 NumberFormatException이 발생한다
                // Integer.parseInt를 설정해서 int형만 사용이 가능한데 -는 String 형으로 들어왔으니 오류가 발생한다
                // 그래서 75238132 에서 1, 0번째를 조건 검사하면 둘다 홀수라서 7과 5 사이에 -이 추가되는데
                // 다음 i는 증가돼서 2, 7-5238132 여기서 2번째는 5, 1번째는 -인데 Integer.parseInt 때문에 위의 오류가 발생
                // 그러니까 for문 한 번 돌 때마다 마지막에 i를 증가시키는 로직을 추가해야한다
                // 그렇게되면, 7-5238132 에서 -이 추가가 된 후에 i를 증가시켜서 기존의 5와 -를 비교하는게 아닌, 그 다음
                // 3번째와 2번째를 비교하게 되는데, 그러면 2와 5를 비교하게 된다
                // 이런 로직대로 흐르게 되면 홀수사이에만 -이 붙게 된다
        }
    }
        return String.join("", list);
    }
}
