package AssignMent7;
import java.util.Arrays;
public class CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        boolean rs = canMakeArithmeticProgression(arr);
        if (rs == true)
            System.out.println(true);
        else
            System.out.println(false);
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int absDifference = Math.abs(arr[1] - arr[0]);
        for (int i = 1; i < arr.length - 1; i++) {
            if (absDifference != Math.abs(arr[i + 1] - arr[i]));
            return false;
        }
        return true;
    }
}
