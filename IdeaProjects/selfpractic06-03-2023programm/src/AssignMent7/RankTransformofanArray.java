package AssignMent7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformofanArray {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        int[] z = arrayRankTransform(arr);
        System.out.println(Arrays.toString(z));
    }
    public static int[] arrayRankTransform(int[] arr) {
      int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) copyArr[i] = arr[i];
            Arrays.sort(copyArr);
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : copyArr) {
            if (!map.containsKey(num)) map.put(num,map.size() + 1);
        }
        for (int i = 0; i < arr.length; i++)  arr[i] = map.get(arr[i]);
        return arr;
    }
}
