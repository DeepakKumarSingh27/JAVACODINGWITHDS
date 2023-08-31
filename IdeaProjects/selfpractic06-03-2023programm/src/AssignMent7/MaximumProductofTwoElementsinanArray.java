package AssignMent7;
public class MaximumProductofTwoElementsinanArray {
    public static void main(String[] args) {
       int[] nums = {3,7};
       int z = maxProduct(nums);
        System.out.println(z);
    }
    public static int maxProduct(int[] nums) {
       int first = 0 ,second = 0;
       for(int num : nums) {
           if (num > first) {
               second = first;
               first = num;
           } else if( num > second) {
               second = num;
           }
       }
       return (first - 1) * (second - 1);
    }
}
/*
 int big = nums[0];
        for (int i = 0; i < nums.length; i++) if (big < nums[i]) big = nums[i];
        int i = 1;
        int j = big;
        int z = (nums[i] - 1) * (nums[j] - 1);
        return big;
 */