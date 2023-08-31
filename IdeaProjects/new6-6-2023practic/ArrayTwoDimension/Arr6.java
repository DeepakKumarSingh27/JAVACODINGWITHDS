package ArrayTwoDimension;
import java.util.Arrays;
public class Arr6 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.ReadArray();
        System.out.println("user entered array element is ");
        ao.DisplayArray(x);
        int[][] sum = ArrayElementSum(x);
        System.out.println("Array Element sum is ");
        ao.DisplayArray(sum);
    }

    public static int[][] ArrayElementSum(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int sum =0;
               do {
                   int r = mat[i][j] % 10;
                   sum +=r;
                   mat[i][j] /= 10;
               }while (mat[i][j] != 0);
               mat[i][j] = sum;
            }
        }
        return mat;
    }
}
