/*
    테스트 케이스
*/

package convertListToObject;

import java.util.HashMap;

public class ConvertListToObject {
    public static void main(String[] args) {

        SolutionConvertListToObject test = new SolutionConvertListToObject();

        String[][] arr1 = new String[][]{
                {"make", "Ford"},
                {"model", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"},
        };

        String[][] arr2 = new String[][]{
                {"season", "summer"},
                {"month", "july"},
                {"year", "2022"},
                {"make", "happy"},
        };

        //빈 배열 입력받을 경우
        String[][] arr3 = new String[][]{};

        //  [[]] 입력받은 경우
        String[][] arr4 = new String[][]{{}};

        // Key 중복 경우
        String[][] arr5 = new String[][]{
                {"one", "love"},
                {"one", "friendship"}
        };

        HashMap<String, String> output1 = test.convertListToHashMap(arr1);
        HashMap<String, String> output2 = test.convertListToHashMap(arr2);
        HashMap<String, String> output3 = test.convertListToHashMap(arr3);
        HashMap<String, String> output4 = test.convertListToHashMap(arr4);
        HashMap<String, String> output5 = test.convertListToHashMap(arr5);

        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
        System.out.println(output5);
    }
}
/*
    [output]

    {year=1964, model=Mustang, make=Ford}
    {month=july, year=2022, season=summer, make=happy}
    {}
    {}
    {one=love}

*/