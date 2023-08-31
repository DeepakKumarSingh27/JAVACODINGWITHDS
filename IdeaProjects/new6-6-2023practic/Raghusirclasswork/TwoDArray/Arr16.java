package Raghusirclasswork.TwoDArray;

import java.util.Arrays;

public class Arr16 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] mat = ao.readArray();
        System.out.println("user entered element is ");
        ao.disp(mat);
        int[] big = dwiseBiggest(mat);
        System.out.println(Arrays.toString(big));
    }

    public static int[] dwiseBiggest(int[][] mat) {
        int pbig=mat[0][0];
        int sbig=mat[0][mat.length-1];
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][i] >pbig){
                pbig= mat[i][i];
            }
            if (mat[i][mat.length-1-i] > sbig){
                sbig=mat[i][mat.length-1-i];
            }
        }
        return new int[]{pbig,sbig};
    }
}
