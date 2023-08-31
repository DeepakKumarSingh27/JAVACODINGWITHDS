package AssignMent7;

import java.util.Arrays;
import java.util.HashSet;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
       //int[] nums = {3,2,1};
       // int[] nums = {2,2,3,1};
        //int[] nums = {1,2};
        int[] nums = {1,1,2};
        int z = thirdMax(nums);
        System.out.println(z);
    }
    public static int thirdMax(int[] nums) {
//       int small = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if (nums.length == 2){
//                return 2;
//            }
//            if (small > nums[i]) {
//              small = nums[i];
//            }
//        }
//        return small;
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums) {
          hs.add(i);
        }
        int[] arr = new int[hs.size()];
        int k = 0;
        for (int i : hs) {
            arr[k] = i;
            k++;
        }
        Arrays.sort(arr);
        if (arr.length < 3)
            return arr[arr.length - 1];
        return arr[arr.length - 3];
    }
}
