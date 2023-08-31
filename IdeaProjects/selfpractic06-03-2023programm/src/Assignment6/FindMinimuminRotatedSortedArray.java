package Assignment6;
public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {11,13,15,17};
        int z = findMin(nums);
        System.out.println(z);
    }
    public static int findMin(int[] nums) {
        int small = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < small)
                small = nums[i];
        }
        return small;
    }
}
