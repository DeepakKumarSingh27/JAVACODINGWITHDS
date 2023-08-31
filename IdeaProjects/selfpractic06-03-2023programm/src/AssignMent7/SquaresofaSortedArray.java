package AssignMent7;
import java.util.Arrays;
public class SquaresofaSortedArray {
    public static void main(String[] args) {
       int[] nums = {-7,-3,2,3,11};
       int[] z = sortedSquares(nums);
        System.out.println(Arrays.toString(z));

    }
    public static int[] sortedSquares(int[] nums) {
      int[] sqrt = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sqrt[i] =  nums[i] * nums[i];
        }
        Arrays.sort(sqrt);
        return sqrt;
    }
}
