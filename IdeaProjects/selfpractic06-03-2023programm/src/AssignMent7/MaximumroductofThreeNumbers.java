package AssignMent7;

import java.util.Arrays;

public class MaximumroductofThreeNumbers {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        int z = maximumProduct(nums);
        System.out.println(z);
    }
    public  static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max1 = nums[0] * nums[1] * nums[n - 1];
        int max2 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        return Math.max(max1,max2);
    }
}
