/*
    TEST CASE
 */

package isIsogram;

public class IsIsogram {
    public static void main(String[] args) {
       SolutionIsIsogram test = new SolutionIsIsogram();

       boolean output1 = test.isIsogram("abcdefffgg");
       boolean output2 = test.isIsogram("");
       boolean output3 = test.isIsogram("droPANDboX");
       boolean output4 = test.isIsogram("JPHWAny");
       boolean output5 = test.isIsogram("reallyYOUWANTIT");

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
        System.out.println(output5);
    }

}

/*
    output

    false
    true
    false
    true
    false

 */
