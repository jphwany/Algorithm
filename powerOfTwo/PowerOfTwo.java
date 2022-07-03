/*
    테스트 케이스
*/


package powerOfTwo;

public class PowerOfTwo {
    public static void main(String[] args) {
        SolutionPowerOfTwo test = new SolutionPowerOfTwo();

        boolean result1 = test.powerOfTwo(16);
        System.out.println(result1);

        boolean result2 = test.powerOfTwo(20);
        System.out.println(result2);

        boolean result3 = test.powerOfTwo(27);
        System.out.println(result3);

        boolean result4 = test.powerOfTwo(32);
        System.out.println(result4);
    }
}
/*
    [output]

    true
    false
    false
    true

*/
