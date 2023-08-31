package Assignment6;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class CountofSmallerNumbersAfterSelf {
    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1};
        // int[] nums = {-1};
        List<Integer> list = countSmaller(nums);
        for (Integer l : list) {
            System.out.print(l + " ");
        }
    }

    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int ct = 0;
            list.add(count(nums, i + 1, nums[i], ct));
        }
        return list;
    }

    public static int count(int arr[], int in, int x, int ct) {
        if (in == arr.length - 1)
            return ct;
        if (x > arr[in])
            ct++;
        return count(arr, ++in, x, ct);

    }
}
//    public static List<Integer> countSmaller(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length - 1; i++) {
//            int f = i + 1;
//            int c = 0;
//            while(f < nums.length){
//                if(nums[i] > nums[f]){
//                    c++;
//                }
//                f++;
//            }
//            list.add(c);
//        }
//        list.add(0);
//        return list;
//    }
//}
/*
 for (int i = 0; i < nums.length; i++) {
                int small = nums[i];
                if (nums[i] == -1) {
                    list.add(0);
                } else if (i == nums.length - 1) {
                    list.add(0);
                    break;
                } else if (small > nums[i+1]) {
                    small = nums[i+1];
                    list.add(small);
                }
            }
        return list;
 */