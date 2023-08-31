package Raghusirclasswork.TwoDArray;

import java.util.Arrays;

public class Arr9 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] mat = ao.readArray();
        System.out.println("user entered element is ");
        ao.disp(mat);
        int[] sum=rowWiseSum(mat);
        System.out.println("sum is"+ Arrays.toString(sum));
    }

    public static int[] rowWiseSum(int[][] mat) {
        int[] sum =new int[mat.length];
        for (int i = 0; i <mat.length ; i++) {
           // sum[i]=mat[0][i];
            for (int j = 0; j < mat[i].length; j++) {
              sum[i]+=mat[i][j];
            }
        }
        return sum;
    }
}
