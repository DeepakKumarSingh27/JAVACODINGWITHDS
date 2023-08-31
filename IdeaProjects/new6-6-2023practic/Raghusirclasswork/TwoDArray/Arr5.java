package Raghusirclasswork.TwoDArray;

import java.util.Arrays;

public class Arr5 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] mat= ao.readArray();
        System.out.println("user entered element is ");
        ao.disp(mat);
        int[][] sum= getSum(mat);
        System.out.println("sum of Array element is ");
        ao.disp(sum);
    }

    public static int[][] getSum(int[][] mat) {
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[0].length ; j++) {
                int sum=0;
                do {
                    int d= mat[i][j]%10;
                    sum+=d;
                    mat[i][j]/=10;
                }while (mat[i][j]!=0);
                mat[i][j]=sum;
            }
        }
        return mat;
    }
}
