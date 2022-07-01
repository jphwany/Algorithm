import java.util.*;

public class SolutionTransformFirstAndLast {

    public HashMap<String, String> transformFirstAndLast(String[] arr){
        if(arr.length == 0){
            return null;
        }

        HashMap<String, String> map = new HashMap<>();

        String key1 = arr[0];
        String value1 = arr[arr.length-1];

        map.put(key1, value1);

        return map;
    }
}
