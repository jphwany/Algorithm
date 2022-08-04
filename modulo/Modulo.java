/*
    TEST CASE
 */

package modulo;

public class Modulo {
    public static void main(String[] args) {
        SolutionModulo test = new SolutionModulo();

        Integer output1 = test.modulo(21,2);
        Integer output2 = test.modulo(3,3);
        Integer output3 = test.modulo(0,0);
        Integer output4 = test.modulo(0,2);
        Integer output5 = test.modulo(2,0);
        Integer output6 = test.modulo(154621,24);

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
        System.out.println(output5);
        System.out.println(output6);
    }
}
/*
    output

    1
    0
    null
    0
    null
    13

 */
