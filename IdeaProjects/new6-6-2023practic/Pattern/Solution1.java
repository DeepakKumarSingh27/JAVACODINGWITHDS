package Pattern;
import java.util.Arrays;

public class Solution1 {


//    public class Solution {

        public int maxPairs(int input1, int[] input2, int input3, int[] input4) {
            Arrays.sort(input2);
            Arrays.sort(input4);

            int pairs = 0;
            int subjectIdx = input2.length - 1;

            for (int limit : input4) {
                while (subjectIdx >= 0 && input2[subjectIdx] > limit) {
                    subjectIdx--;
                }

                if (subjectIdx < 0) {
                    break;
                }

                pairs++;
                subjectIdx--;
            }

            return pairs;

        }

        public static void main(String[] args) {
            Solution1 solution = new Solution1();

            int[] subjectCredits = {44, 45, 56, 39, 2, 6, 17, 75};
            int[] creditLimits = {54};
            int maxPairs = solution.maxPairs(subjectCredits.length, subjectCredits, creditLimits.length, creditLimits);

            System.out.println(maxPairs); // Output: 3
        }
    }
