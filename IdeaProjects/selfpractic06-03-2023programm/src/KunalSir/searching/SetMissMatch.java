package KunalSir.searching;
import java.util.Arrays;
public class SetMissMatch {
    public static void main(String[] args) {
      int[]  nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if ( arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] !=index + 1){
                return new int[]{arr[index], index + 1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    }
