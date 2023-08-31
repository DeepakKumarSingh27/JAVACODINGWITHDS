package Assignment6;
public class FindMinimuminRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {2,2,2,0,1};
        int z = findMin(nums);
        System.out.println(z);
    }
    public static int findMin(int[] nums) {
    int small =nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (small > nums[i]) {
                small = nums[i];
            }
        }
        return small;
    }
}
