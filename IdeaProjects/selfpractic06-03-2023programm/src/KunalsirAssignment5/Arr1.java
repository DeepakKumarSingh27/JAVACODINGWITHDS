package KunalsirAssignment5;
import java.util.Arrays;
public class Arr1 {
    public static void main(String[] args) {
      int[] nums = {5,0,1,2,3,4};
      //  buildArray(nums);
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    public static int[] buildArray(int[] nums) {
       //int n=nums.length;
       int ans[]=new int[nums.length];
       for (int i=0;i<nums.length;i++){
         ans[i]=nums[nums[i]];
       }
       return ans;
    }
}
