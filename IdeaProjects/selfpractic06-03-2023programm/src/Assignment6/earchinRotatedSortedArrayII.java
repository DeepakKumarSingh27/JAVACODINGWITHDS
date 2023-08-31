package Assignment6;
public class earchinRotatedSortedArrayII {
    public static void main(String[] args) {
//       int[] nums = {2,5,6,0,0,1,2};
//       int target = 0;
        int[] nums = {2,5,6,0,0,1,2};
        int target = 3;
       boolean rs = search(nums,target);
       if (rs == true)
           System.out.println(rs);
       else
           System.out.println(rs);
    }
    public static boolean search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return true;
        }
        return false;
    }
}
