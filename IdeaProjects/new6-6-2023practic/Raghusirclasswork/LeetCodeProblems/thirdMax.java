package Raghusirclasswork.LeetCodeProblems;

public class thirdMax {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        int max = thirdMax(nums);
        System.out.println(max);
    }
    public static int thirdMax(int[] nums) {
        int max =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums.length == nums.length){
                max= nums[i];
            }
        }
        return max;
    }
}
