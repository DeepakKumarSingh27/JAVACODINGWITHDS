package Assignment6;
import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
//        int[] numbers = {2,3,4};
//        int target = 6;
//       int[] numbers = {2,7,11,15};
//       int target = 9;
//        int[] numbers = {-1,0};
//        int target = -1;
        int[] numbers = {1,2,3,4,4};
        int target = 8;
        int [] z= twoSum(numbers,target);
        System.out.println(Arrays.toString(z));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if (sum == target)
                {
                    int[] z = {i+1,j+1};
                    return z;
                }
            }

        }
        int[] z={-1,-1};
        return z;
    }
}
/*
2,3,4
6
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 */