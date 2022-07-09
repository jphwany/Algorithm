/*
    test
 */

package letterCapitalize;

public class LetterCapitalize {
    public static void main(String[] args) {
        SolutionLetterCapitalize test = new SolutionLetterCapitalize();
        String output1 = test.letterCapitalize("dev  jphwany");
        String output2 = test.letterCapitalize("be the best");
        String output3 = test.letterCapitalize("hello  mr  my  yesterday");

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
    }
}
/*
   [output]

   Dev  Jphwany
   Be The Best
   Hello  Mr  My  Yesterday

*/
