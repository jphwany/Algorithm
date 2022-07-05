/*
    Q) 문자열을 입력받아 순서가 뒤집힌 문자열 리턴

    input args_1 : str (String 타입 문자열)
    output : String 타입

    [Hint]
    StringBuilder.reverse()를 사용하면 쉽게 해결할 수 있다

*/
package firstReverse;

public class SolutionFirstReverse {
    public String firstReverse(String str){

        StringBuilder result = new StringBuilder();
        // StringBuilder, 문자열을 수정(추가, 삽입, 대체 등등)하려고 할 때 사용하는 시퀀스
        // StringBuffer와 호환되는 API를 제공하지만 동기화가 보장이 되지 않기 때문에 단일 스레드에서 사용되는 위치에서
        // StringBuffer를 대신해서 사용할 수 있도록 설계되었고 보다 빠르기 때문에 빌더를 쓴다
        // result로 선언

        result.append(str);
        // 입력받을 str을 StringBuilder의 result에 넣어줌

        return result.reverse().toString();
        // 입력받을 str을 빌더에 넣어준 상태에서 문자열을 뒤집고 리턴하려고 하는 String 타입으로 변환해주고 리턴한다
    }
}
