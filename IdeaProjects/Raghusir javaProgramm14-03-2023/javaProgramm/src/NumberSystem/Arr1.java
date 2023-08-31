package NumberSystem;
import java.util.Arrays;
public class Arr1 {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
         //twoSum(nums);
        System.out.println();
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i < nums.length;i++)
        {
            for (int j=1; j< nums.length; j++)
            {
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }
}
