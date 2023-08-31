package AssignMent7;
import java.util.Arrays;
public class SortArrayByParity11 {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        int[] z = sortArrayByParityII(nums);
        System.out.println(Arrays.toString(z));
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;
        while (even < nums.length && odd < nums.length) {
            while (even < nums.length && nums[even] % 2 == 0) {
                even += 2;
            }
            while (odd < nums.length && nums[odd] % 2 == 1) {
                odd += 2;
            }
            if (even < nums.length && odd < nums.length) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
        }
        return nums;
    }
}
