package KunalsirAssignment5;
public class Arr6 {
    public static void main(String[] args) {
      int[]  nums = {1,2,3};
      int ans=numIdenticalPairs(nums);
        System.out.println(ans);
    }
    public static int numIdenticalPairs(int[] nums) {
        int ans=0;
        for (int i=0;i<nums.length;i++)
      {
          for (int j = i+1; j < nums.length; j++) {
              if (nums[i]==nums[j]){
                  ans++;
              }

          }
      }
        return ans;
    }
}
