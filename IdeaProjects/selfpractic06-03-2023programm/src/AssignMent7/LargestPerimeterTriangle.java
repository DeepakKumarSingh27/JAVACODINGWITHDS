package AssignMent7;
import java.util.Arrays;
public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums = {1,2,1,10};
        int z = largestPerimeter(nums);
        System.out.println(z);
    }
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length-1; i >1 ; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2])
            return nums[i] + nums[i - 1] + nums[i - 2];
        }
        return 0;
      }
   }
/*
       if (nums.length > 3){
           return 0;
       }
       int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
 */