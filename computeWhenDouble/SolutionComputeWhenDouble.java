/*
    Q) 연 이율을 입력받아 원금이 2배 이상이 될 때까지 걸리는 시간(년) 리턴

    input) args_1 : interestRate (double 타입의 연이율 %)
    output) int 타입 리턴


    원금 집어넣고 1년씩 지날 때 마다 연이율에 따라 (원금 + 1년 이자) 변하다가
    어느 순간 원금의 2배가 되는 시점이 있다

    원금, 1년 이자, 걸리는 시간이 필요하다

*/

package computeWhenDouble;

public class SolutionComputeWhenDouble {
    public int computeWhenDouble(double interestRate){

        int year = 0; // 반복문으로 활용하기 위해 걸리는 시간 year 0으로 초기화
        double principal = 1;  // 원금을 1로 잡는다 (2배 이상이 되는 것을 확인하기 때문에 간단하게 1)

        while(principal < 2){
            principal = principal + ((principal * interestRate)/100);
            year++;
        }
        return year;
    }
}

/*
    원금이 2 미만이면 while 문 실행
    그러니까 1로 잡아둔 원금이 2가 된다는 것이, 2배가 된다는 의미
    복리개념이며
    원금에 연이율 interestRate 곱한 것(1년 이자)을 100으로 나눠주고
    원금 + (100으로 나눈 1년이자)를 원금에 할당한채 반복하며 년수를 증가시킨다

    하다보면 결국 원금이 2배가 되는 시점이 오는데
    2배 이상이 되는 이 시점까지 년수가 증가하고
    2배 이상이 되어버리면 더이상 while문은 기능 안하기 때문에
    바로 return 해준다

*/