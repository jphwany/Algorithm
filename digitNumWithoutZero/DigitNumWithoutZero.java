/*
    TEST CASE

 */


package digitNumWithoutZero;

public class DigitNumWithoutZero {
    public static void main(String[] args) {
        SolutionDigitNumWithoutZero test = new SolutionDigitNumWithoutZero();

        long output1 = test.digitNumWithoutZero(9999);
        long output2 = test.digitNumWithoutZero(12989);
        System.out.println(output1);
        System.out.println(output2);

    }
}
/*
    output

    11111
    12991

 */
