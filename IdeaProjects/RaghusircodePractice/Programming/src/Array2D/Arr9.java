package Array2D;
import java.util.Arrays;
public class Arr9 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.readArray();
        System.out.println("user entered element is ");
        ao.Dispaly(x);
        int[] big = rowWiseBiggest(x);
        for (int i = 0; i < big.length; i++) {
            System.out.println(i + 1+" Row wise Biggest  is "+big[i]);
        }
    }
    static int[] rowWiseBiggest(int[][] mat) {
        int big[] = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
             big[i] = mat[i][0];
            for (int j = 1; j <mat[i].length ; j++) {
                if (mat[i][j] > big[i]){
                    big[i] =mat[i][j];
                }
            }
        }
        return big;
    }
}
