/*
   TEST CASE
*/

package reverseArr;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        SolutionReverseArr test = new SolutionReverseArr();

        int[] output1 = test.reverseArr(new int[]{1,2,3});
        int[] output2 = test.reverseArr(new int[]{});
        int[] output3 = test.reverseArr(new int[]{2,4,6,8,10});
        int[] output4 = test.reverseArr(new int[]{1,3,5,7,9,11});

        System.out.println(Arrays.toString(output1));
        System.out.println(Arrays.toString(output2));
        System.out.println(Arrays.toString(output3));
        System.out.println(Arrays.toString(output4));
    }
}
/*
   output

   [3, 2, 1]
   []
   [10, 8, 6, 4, 2]
   [11, 9, 7, 5, 3, 1]

*/
