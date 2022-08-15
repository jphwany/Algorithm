/*
    Q)문자열을 입력받아 아이소그램인지 여부를 리턴.
    * 아이소그램(isogram)이란, 각 알파벳을 한번씩만 이용해서 만든 단어나 문구를 뜻함

    intput args_1 : String 타입의 공백 없는 문자열 str
    output : boolean

    [caution]
    빈 문자열을 입력받은 경우, true 리턴
    대소문자는 구별하지 않음

 */



package isIsogram;

import java.util.HashMap;

public class SolutionIsIsogram {
    public boolean isIsogram(String str){

        // 입력된 문자열 공백일 때 true
        if(str.length() == 0) return true;

        // 문자열이 대소문자 구분하지 않으니까 대문자로 통일
        str = str.toUpperCase();

        // 알파벳 한 번씩만 사용하니까 중복 여부 검사를 위해 HashMap 선언
        HashMap<Character, String> hashMap = new HashMap<>();

        //입력된 문자열 순회하는데
        for(int i = 0; i < str.length(); i++){
            // HashMap에 그 알파벳이 이미 저장되어 있으면
            if(hashMap.containsKey(str.charAt(i))){
                return false; // false 리턴
            }
            // 그게 아니면 저장
            hashMap.put(str.charAt(i), "error");
        }
        // 전부 순회한 뒤에 true 리턴
        return true;
    }
}
