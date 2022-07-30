/*
    TEST CASE
*/

package greedyAlgorithm;

public class GreedyCountChange {
    public static void main(String[] args) {
        SolutionGreedyCountChange test = new SolutionGreedyCountChange();
        int output1 = test.countChange(12345);
        int output2 = test.countChange(49398);
        int output3 = test.countChange(79693);
        int output4 = test.countChange(99999);
        int output5 = test.countChange(1102034);

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
        System.out.println(output5);

    }
}
/*
    output

    32
    110
    168
    213
    2211

 */
