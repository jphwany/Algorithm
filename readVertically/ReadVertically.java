/*
    TEST CASE
*/
package readVertically;

public class ReadVertically {
    public static void main(String[] args){
        SolutionReadVertically test = new SolutionReadVertically();

        String[] input1 = new String[]{
                "hello",
                "world"
        };
        String output1 = test.readVertically(input1);


        String[] input2 = new String[]{
                "jp",
                "hwany"
        };
        String output2 = test.readVertically(input2);


        String[] input3 = new String[]{
                "acegi",
                "bdfh"
        };
        String output3 = test.readVertically(input3);

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
    }
}
/*
  output

  hweolrllod
  jhpwany
  abcdefghi

*/