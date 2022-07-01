package computeWhenDouble;

public class ComputeWhenDouble {
    public static void main(String[] args) {
        SolutionComputeWhenDouble test = new SolutionComputeWhenDouble();

        int result1 = test.computeWhenDouble(1);
        int result2 = test.computeWhenDouble(2.7);
        int result3 = test.computeWhenDouble(3);
        int result4 = test.computeWhenDouble(3.3);
        int result5 = test.computeWhenDouble(5);
        int result6 = test.computeWhenDouble(7);
        int result7 = test.computeWhenDouble(100);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);

    }
}
/*
    [output]

    70
    27
    24
    22
    15
    11
    1

*/
