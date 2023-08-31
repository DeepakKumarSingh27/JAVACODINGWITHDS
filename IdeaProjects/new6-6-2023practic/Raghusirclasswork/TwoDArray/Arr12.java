package Raghusirclasswork.TwoDArray;
import java.util.Arrays;
public class Arr12 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] mat = ao.readArray();
        System.out.println("user entered element is ");
        ao.disp(mat);
        int[] sum = colWiseSum(mat);
        System.out.println(Arrays.toString(sum));
    }
    public static int[] colWiseSum(int[][] mat) {
        int[] sum = new int[mat[0].length];
        for (int i = 0; i <mat[0].length ; i++) {
            for (int j = 0; j < mat.length; j++) {
                sum[i]+=mat[j][i];
            }
        }
        return sum;
    }
}
