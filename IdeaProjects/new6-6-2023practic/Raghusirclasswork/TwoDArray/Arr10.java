package Raghusirclasswork.TwoDArray;
import java.util.Arrays;
public class Arr10 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] mat = ao.readArray();
        System.out.println("user entered element is ");
        ao.disp(mat);
        int[] big = rowWiseBiggest(mat);
        System.out.println(Arrays.toString(big));
    }

    public static int[] rowWiseBiggest(int[][] mat) {
        int[] big = new int[mat.length];
        for (int i = 0; i <mat.length ; i++) {
            big[i]=mat[i][0];
            for (int j = 1; j < mat[0].length; j++) {
                if (mat[i][j] > big[i]){
                    big[i]=mat[i][j];
                }
            }
        }
        return big;
    }
}
