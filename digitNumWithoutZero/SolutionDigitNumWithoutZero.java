package digitNumWithoutZero;

public class SolutionDigitNumWithoutZero {
    public long digitNumWithoutZero(long num){

        // 입력받는 수에 1을 더한 값을 리턴하라고 하니까 처음부터 1을 증가 시켜준다
        num++;

        // 자릿수를 1로 초기화, 반복할 때 일의 자리부터 확인할 예정
        long digitNum = 1;

        // 주어진 num에 1 증가시킨 값에 0이 존재, 그러니까 자릿수로 나눈 몫(해당 자릿수 접근)으로
        // 다시 10으로 나누고 남은 나머지가 0이라면 계속 반복 -> 0을 1로 바꿔줘야하기 때문이다
        while(num / digitNum % 10 == 0){
            num = num + digitNum;   // 입력받은 수 + 1에 자릿수 + 1을 해줘서 0을 없앤다음에
            digitNum = digitNum * 10; // 자릿수를 10의 자리로 옮기기위해 * 10을 해준다
        }
        return num;
    }
}
/*
    9999를 입력받았다면
    num++에 의해 10000이 될거고
    10000 / 1 % 10 == 0이니까, 다시 말해 자릿수에 0이 존재하니까 반복
    num = num + digitNum  -> 10001
    digitNum = digitNum * 10 -> 1 * 10 == 10

    다시 while 반복문 조건으로 왔을 때
    10001을 10으로 나누면 몫은 1000이니까 10으로 나누어 떨어진다 -> 다시 반복
    (10001 / 10 % 10 == 0)
    num = num + digitNum -> 10011
    digitNum = digitNum * 10 -> 10 * 10 == 100

    다시 while 반복문 조건으로 왔을 때
    10011을 100으로 나누면 몫은 100이니까 10으로 나누어 떨어진다 -> 다시 반복
    (10011 / 100 % 10 == 0)
    num = num + digitNum -> 10111
    digitNum = digitNum * 10 -> 1000

    다시 while 반복 조건으로 왔을 때
    10111을 1000으로 나누면 몫은 10, 10으로 나누어 떨어진다 -> 다시 반복
    (10111 / 1000 % 10 == 0)
    num = num + digitNum -> 11111
    digitNum = digitNum * 10 -> 10000

    다시 while 반복 조건으로 왔을 때
    11111을 10000으로 나누면 몫은 1로 10으로 더이상 나누어 떨어지지 않는다 -> 반복 끝

    return 11111

 */
