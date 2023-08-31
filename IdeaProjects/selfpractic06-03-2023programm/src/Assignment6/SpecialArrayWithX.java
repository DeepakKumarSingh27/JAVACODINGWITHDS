package Assignment6;
public class SpecialArrayWithX {
    public static void main(String[] args) {
        int[] nums = {3,5};
        // int[] nums = {0,4,3,0,4};
        // int[] nums = {0,0};
        int z = specialArray(nums);
        System.out.println(z);
    }
    public static int specialArray(int[] nums) {
        int[] ans = new int[1001];
        for (int num : nums)
            ans[num]++;
        int total = nums.length;
        for (int i = 0; i < 1001; i++) {
            if (i == total)
                return i;
            total -= ans[i];
        }
        return -1;
    }
}
