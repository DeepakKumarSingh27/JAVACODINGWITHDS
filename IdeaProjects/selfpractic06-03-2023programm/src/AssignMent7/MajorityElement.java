package AssignMent7;
public class MajorityElement {
    public static void main(String[] args) {
       int[] nums = {2,2,1,1,1,2,2};
       int z = majorityElement(nums);
       System.out.println(z);
    }
    public static int majorityElement(int[] nums) {
     int count = 0;
     int candidate = 0;
     for (int num : nums) {
         if (count == 0) {
             candidate = num;
         }
         if (num == candidate) count += 1;
         else count -= 1;
     }
     return candidate;
    }
}
