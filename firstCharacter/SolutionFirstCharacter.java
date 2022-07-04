/*
    Q) 문자열을 입력받아 문자열을 구성하는 각 단어의 첫 글자로 이루어진 문자열 리턴

    input) args_1 : str (String 타입의 공백이 있는 알파벳 문자열)

    output) String 타입

    [caution]
    1. 단어는 공백 한 칸으로 구분
    2. 연속된 공백은 없다
    3. 빈 문자열 입력받은 경우, 빈 문자열 리턴

*/

package firstCharacter;

public class SolutionFirstCharacter {
    public String firstCharacter(String str){

        if(str.length() == 0){
            return "";
        }
        // 빈 문자열을 입력받을 경우 빈 문자열 리턴

        String[] output = str.split(" ");
        // 반복문을 위한 문자열 구성
        // 공백 한 칸으로 구분하며 연속된 공백은 없다

        StringBuilder result = new StringBuilder();
        // StringBuilder 선언
        // String은 고정 길이라서 한 번 작성한 문자열 뒤에 문자열을 추가하거나 하는 경우에
        // 새로운 문자열을 작성해줘야 하는 번거로움이 생기기 때문에
        // 가변 길이의 문자열을 사용해야 하는 경우 이렇게 스트링 빌더를 사용한다


        //향상된 for문 사용
        for (String s : output) {
            result.append(s.charAt(0));
            //스트링 빌더 result에 반복문 돌며 output의 첫번째 문자 요소 추가
        }

/*
        일반적인 for문
        for (int i = 0; i < output.length; i++) {
            result.append(output[i].charAt(0));
        }
*/
        return result.toString();
        // String 타입을 리턴해야하는데 result는 StringBuilder(클래스)라서 toString() 적용시켜서 String으로 바꿔줘야 한다
    }
}

/*
        # 초기의 생각

        if(str.length() == 0){
            return "";
        }

        String result = "";
        => 반복문 돌릴 result라는 변수 빈 문자열로 초기화

        for(int i = 0; i < output.length; i++){
            result = result + output[i].charAt(0);
        }
       => char + "" 는 String 타입으로 자동 형변환이 된다

        return result;
*/