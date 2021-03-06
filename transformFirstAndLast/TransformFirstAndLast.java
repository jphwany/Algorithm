/*
    테스트 케이스
*/
package transformFirstAndLast;
import java.util.*;

public class TransformFirstAndLast {
    public static void main(String[] args) {

        SolutionTransformFirstAndLast test = new SolutionTransformFirstAndLast();

        String[] arr1 = new String[]{"Queen", "Elizabeth", "Of Hearts", "Beyonce"};
        String[] arr2 = new String[]{"Kevin", "Love", "Hart", "Costner", "Spacey"};
        String[] arr3 = new String[]{"jphwany", "950523", "backend", "dev"};
        String[] arr4 = new String[]{};

        HashMap<String, String> result1 = test.transformFirstAndLast(arr1);
        HashMap<String, String> result2 = test.transformFirstAndLast(arr2);
        HashMap<String, String> result3 = test.transformFirstAndLast(arr3);
        HashMap<String, String> result4 = test.transformFirstAndLast(arr4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
/*
    [output]

    {Queen=Beyonce}
    {Kevin=Spacey}
    {jphwany=dev}
    null

*/
