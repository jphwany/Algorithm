package ABCheck;

public class ABCheck {
    public static void main(String[] args) {
        SolutionABCheck test = new SolutionABCheck();
        boolean output1 = test.ABCheck("skfjakdfnj");
        boolean output2 = test.ABCheck("aldlbsldksls");
        boolean output3 = test.ABCheck("bklwaflDFADF");
        boolean output4 = test.ABCheck("ADFGWRAZXCDQQWR");
        boolean output5 = test.ABCheck("");
        boolean output6 = test.ABCheck("sklfnqiwpqdfndmaklkb");

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
        System.out.println(output5);
        System.out.println(output6);
    }
}
/*
    [output]

    false
    true
    true
    false
    false
    true
 */
