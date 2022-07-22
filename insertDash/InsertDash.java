/*
   TEST CASE
*/

package insertDash;

public class InsertDash {
    public static void main(String[] args) {
        SolutionInsertDash test = new SolutionInsertDash();

        String output1 = test.insertDash("75238132");
        System.out.println(output1);

        String output2 = test.insertDash("");
        System.out.println(output2);

        String output3 = test.insertDash("02189");
        System.out.println(output3);

        String output4 = test.insertDash("6734611997679419173");
        System.out.println(output4);

        String output5 = test.insertDash("0364649584527734248497490956436424513856401903589");
        System.out.println(output5);
    }
}
/*
   [output]

   7-52381-32
   null
   02189
   67-3461-1-9-9-767-941-9-1-7-3
   0364649-584527-7-3424849-74909-564364245-1-3856401-903-589

*/

