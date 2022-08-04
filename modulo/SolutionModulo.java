/*
    Q) 두 수(num1, num2)를 입력받아, num1를 num2로 나눈 나머지를 리턴
    input args_1 : int 타입의 정수 (num1 >= 0)
    input args_2 : int 타입의 정수 (num2 >= 0)
    output : Integer

    [caution]
    나눗셈(/), 나머지(%) 연산자 사용 금지
    0은 어떤 수로 나누어도 나머지가 0
    어떤 수도 0으로 나눌 수 없다. 이 경우 null 리턴

 */

package modulo;

public class SolutionModulo {
    public Integer modulo(int num1, int num2){

        //0으로 나눌 수 없는데 나눈다면 null 리턴, 나누는 수가 num2니까
        if(num2 == 0) return null;

        while(num1 >= num2){
            num1 = num1 - num2;
        }
        return num1;
    }
}

/*

     나누기, 나머지 연산자를 쓰지 못하는 상황에서
     나눈 나머지를 리턴하는 다른 방법을 생각해야 한다

     어떤 수를 어떤 수로 나누고 남은 나머지라는 것은 결국
     어떤 수를 얼마만큼 반복해서 뺀다 라는 의미랑 같다

     예를들어, 21을 2로 나눈 나머지를 구한다고 했을 때
     몫은 10, 나머지는 1이 될텐데 이걸 늘어놓는다면
     21을 2씩 10번 빼고 남은 나머지가 1, 더이상 2로 뺄 수 없으니 나머지가 1이라는 소리다
     21-2=19, 19-2=17, 17-2=15, 15-2=13, 13-2=11, 11-2=9, 9-2=7, 7-2=5, 5-2=3, 3-2=1

     그렇다면 num1을 num2로 나누니까 num1을 num2만큼 반복해서 빼다가 그 뺀 값이 num2보다 작아지면 그 뺀 값을 리턴하면 된다

*/

/*
    같은 로직이지만 다른 방법 사용 (재귀함수 사용)

    if(num2 == 0) return null;

    if(num1 == 0) return 0;

    if(num1 >= num2){
     num1 = num1 - num2;
    }

    if(num1 < num2){
      return num1;
    }

    else
    return modulo(num1, num2);


*/
