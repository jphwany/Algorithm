/*
   TEST CASE
*/

package removeExtreames;

import java.util.Arrays;

public class RemoveExtremes {
    public static void main(String[] args) {
        SolutionRemoveExtremes test = new SolutionRemoveExtremes();

        String[] output1 = test.removeExtremes(new String[]{"a", "b", "c", "def"});
        String[] output2 = test.removeExtremes(new String[]{"where", "is", "the", "longest", "word"});
        String[] output3 = test.removeExtremes(new String[]{"iAmLongest", "iAmNotShortest", "iAmLongest", "long"});
        String[] output4 = test.removeExtremes(new String[]{});
        String[] output5 = test.removeExtremes(new String[]{"afdafd", "asasas", "qszczz", "def", "", "fff"});

        System.out.println(Arrays.toString(output1));
        System.out.println(Arrays.toString(output2));
        System.out.println(Arrays.toString(output3));
        System.out.println(Arrays.toString(output4));
        System.out.println(Arrays.toString(output5));


    }
}
/*
    [output]

    [a, b]
    [where, the, word]
    [iAmLongest, iAmLongest]
    null
    [afdafd, asasas, def, fff]

 */
