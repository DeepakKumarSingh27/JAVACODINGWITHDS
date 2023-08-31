package Array2D;
import java.util.Arrays;
public class Arr8 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.readArray();
        System.out.println("user entered element is ");
        ao.Dispaly(x);
        int[] z = rowWiseSum(x);
        System.out.println("Row wise sum is ");
        System.out.println(Arrays.toString(z));
    }
    static int[] rowWiseSum(int[][] mat) {
        int sum[] = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <mat[i].length ; j++) {
                sum[i] += mat[i][j];
            }
        }
        return sum;
    }
}
