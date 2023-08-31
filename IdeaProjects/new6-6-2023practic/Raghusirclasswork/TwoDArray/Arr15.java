package Raghusirclasswork.TwoDArray;

import java.util.Arrays;

public class Arr15 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] mat = ao.readArray();
        System.out.println("user entered element is ");
        ao.disp(mat);
        int[] sum =dwiseSum(mat);
        System.out.println(Arrays.toString(sum));
    }
    public static int[] dwiseSum(int[][] mat) {
     int psum =0,ssum=0;
        for (int i = 0; i <mat.length ; i++) {
           psum=psum+mat[i][i];
           ssum=ssum+mat[i][mat.length-1-i];
        }
        int[] ct ={psum,ssum};
        return ct;
    }
}
