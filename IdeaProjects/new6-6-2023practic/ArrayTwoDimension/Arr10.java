package ArrayTwoDimension;
import java.util.Arrays;
public class Arr10 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.ReadArray();
        System.out.println("user entered array element is ");
        ao.DisplayArray(x);
        int[] sum = rowWiseSum(x);
        System.out.println("Row wise sum is "+ Arrays.toString(sum));
    }

    public static int[] rowWiseSum(int[][] mat) {
        int[] sum = new int[mat[0].length];
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                sum[i] += mat[i][j];
            }
        }
        return sum;
    }
}
