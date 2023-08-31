package Assignment6;
public class SingleElementinaSortedArray {
    public static void main(String[] args) {
        // int[] nums = {1,1,2,3,3,4,4,8,8};
        //  int[] nums = {3,3,7,7,10,11,11};
        // int[] nums = {1};
        int[] nums = {1,1,2};
        int z =  singleNonDuplicate(nums);
        System.out.println(z);
    }
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int lo = 0,hi = n - 1;
        while (lo < hi){
            int mid = lo  + (hi - lo) / 2;
            if ((mid % 2 == 0 && mid + 1 < n && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && mid - 1 >= 0 && nums[mid] == nums[mid - 1]))
                lo = mid + 1;
            else
                hi = mid;
            if (mid - 1 >= 0 && mid + 1 < n && nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) return nums[mid];

        }
        return nums[lo];
    }
}
/*
 for (int i = 0; i < nums.length; i = i + 2) {
            for (int j = 0; j <= i; j++) {
                if (nums.length > 1 && i >= i ) {
                    if (nums[i] == nums[i + 1]) {

                    } else {
                        return nums[i];
                    }
                }
            }
        }
        return  1;
 */