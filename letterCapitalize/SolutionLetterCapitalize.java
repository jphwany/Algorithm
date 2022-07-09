/*
    Q) 문자열 입력받아 문자열을 구성하는 각 단어 첫 글자가 대문자인 문자열 리턴
    input args_1 : str (String 타입의 공백이 있는 알파벳 문자열)
    output : String 타입

    [caution]
    1. 단어는 공백으로 구분
    2. 연속된 공백이 존재할 수 있음
    3. 빈 문자열 입력받은 경우, 빈 문자열 리턴

 */

package letterCapitalize;

public class SolutionLetterCapitalize {
    public String letterCapitalize(String str){

        if(str.length() == 0) return "";
        // 빈 문자열 입력받으면 빈 문자열 출력

        String[] word = str.split(" ");
        // 입력받는 str을 공백 단위로 끊어서 새로운 배열 word 선언 후 할당

        String result;
        // 결과 값 리턴할 result 변수 선언

        for(int i = 0; i < word.length; i++){
            if(word[i].isEmpty()){
                word[i] = word[i];
            }else
                word[i] = String.valueOf(word[i].charAt(0)).toUpperCase() + word[i].substring(1);
        }

        result = String.join(" ", word);
        return result;
    }
}
/*
   공백을 기준으로 단어를 구분 (연속된 공백이 존재한다)
   그렇게 구분된 단어의 첫 글자가 대문자인 문자열을 출력
   입력받는 공백있는 문자열을 공백단위로 쪼개는게 첫 번째

   그런데 연속된 공백이 있을 수도 있다고 했다. 이 부분은 어떻게 처리를 해야할까
   hello  world 라고 했을 때

   hello
   ""
   world

   그리고 반복문에 들어갔을 때
   조건문에 의해 빈 문자열은 그대로 무시
   그리고 빈 문자열이 아닌 경우 else 문 작동

   그렇게 반복문을 다 돈 결과를 공백을 기준으로 구분해서 결과 값에 할당 후 리턴

*/