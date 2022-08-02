/*
    TEST CASE
 */

package superIncreasing;

public class SuperIncreasing {
    public static void main(String[] args) {

    SolutionSuperIncreasing test = new SolutionSuperIncreasing();

    boolean output1 = test.superIncreasing(new int[]{1, 3, 6, 13, 55});
    boolean output2 = test.superIncreasing(new int[]{-120, 540, 1024});
    boolean output3 = test.superIncreasing(new int[]{1, 3, 5, 9});
    boolean output4 = test.superIncreasing(new int[]{979, 1737, -2140, -400, 1500});

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);

    }
}
/*
    output

    true
    true
    false
    false

 */
