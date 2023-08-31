import java.util.Arrays;

public class CreditPairs {
    public static int findMaxPairs(int[] subjectCredits, int[] creditLimits) {
        Arrays.sort(subjectCredits);
        Arrays.sort(creditLimits);

        int pairs = 0;
        int subjectIdx = subjectCredits.length - 1;

        for (int limit : creditLimits) {
            while (subjectIdx >= 0 && subjectCredits[subjectIdx] > limit) {
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
        int[] subjectCredits = {44, 45, 56, 39, 2, 6, 17, 75};
        int[] creditLimits = {54};

        int maxPairs = findMaxPairs(subjectCredits, creditLimits);
        System.out.println(maxPairs);


    }
}
