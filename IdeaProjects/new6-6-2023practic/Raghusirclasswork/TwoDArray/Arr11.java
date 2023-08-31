package Raghusirclasswork.TwoDArray;
import java.util.Arrays;
public class Arr11 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] mat = ao.readArray();
        System.out.println("user entered element is ");
        ao.disp(mat);
        int[] col =colWiseBiggest(mat);
        System.out.println(Arrays.toString(col));

    }

    public static int[] colWiseBiggest(int[][] mat) {
        int[] big = new int[mat[0].length];
        for (int i = 0; i <mat[0].length ; i++) {
            big[i]=mat[0][i];
            for (int j = 1; j <mat[i].length ; j++) {
                if (mat[j][i] > big[i]){
                    big[i]=mat[j][i];
                }
            }
        }
        return big;
    }
}
