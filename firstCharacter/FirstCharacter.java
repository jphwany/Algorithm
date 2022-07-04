/*
    테스트 케이스
*/

package firstCharacter;

public class FirstCharacter {
    public static void main(String[] args) {
        SolutionFirstCharacter test = new SolutionFirstCharacter();
        String output1 = test.firstCharacter("dev jphwany");
        String output2 = test.firstCharacter("Backend Engineer");
        String output3 = test.firstCharacter("May be Happy");
        String output4 = test.firstCharacter("we were never meant to be");

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
    }
}
/*
   [output]

   dj
   BE
   MbH
   wwnmtb

*/
