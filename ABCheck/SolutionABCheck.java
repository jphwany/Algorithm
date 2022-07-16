/*
    Q) 문자열을 입력받아 문자열 내에
    'a'로 시작해서 'b'로 끝나는 길이 5 문자열
    'b'로 시작해서 'a'로 끝나는 길이 5 문자열
    중에 하나가 존재하는지 여부 리턴

    input args_1 : str (String 타입의 알파벳 문자열)
    output : boolean 타입

    [caution]
    1. 대소문자 구분 하지 않음
    2. 공백도 한 글자 취급
    3. 'a', 'b'는 중복해서 등장 가능

*/

package ABCheck;

public class SolutionABCheck {
    public boolean ABCheck(String str){

        str = str.toLowerCase(); // 대소문자 구분하지 않으니까 전부 소문자로 통일

        for(int i = 4; i < str.length(); i++){

            if((str.charAt(i) == 'a' && str.charAt(i-4) == 'b') || (str.charAt(i) == 'b' && str.charAt(i-4) == 'a')){
                return true;
            }
        }
        return false; // 위의 조건에 맞지 않으면 죄다 false니까 빈 문자열 또한 false
    }
}

/*
    조건문으로 검색할 때 i번째에 a가있고 i+4 번째에 b가 있다면 그건 문자열 길이 5의 마지막 5번째에 b가 있다는 말이니까
	i가 0부터 시작할 때 0번째에 a, 4번째에 b,
	i가 1일 때 1번째에 a, 5번째에 b ...
	라고 생각하면 문자열의 마지막 요소에 조건문이 들어갈 경우 StringIndexOutOfBoundsException 에러가 날 수 있다

	그러니까 요소를 빼가면서 순회한다면 이 에러를 막을 수 있을 것이다
	어느 한 지점에서 -4를 해서 문자열 길이 5만큼을 계속 검사한다면
	문자열 마지막 요소에 접근하더라도 인덱스를 초과하는 것이 아니기 때문에 에러가 나질 않는다

	str.charAt(i) == 'a' && str.charAt(i-4) == 'b'  이부분은 결국 뒤에 있는 i번째, 그러니까 길이 5의 문자열 토막에서
	마지막 요소가 a라는 의미, 그러니까 b * * * a 라는 의미다
*/