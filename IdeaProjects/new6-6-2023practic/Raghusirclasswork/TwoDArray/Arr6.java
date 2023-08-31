package Raghusirclasswork.TwoDArray;
public class Arr6 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] mat = ao.readArray();
        System.out.println("user entered element is ");
        ao.disp(mat);
        int[][] tran=isTranspose(mat);
        System.out.println("After transpose is ");
        ao.disp(tran);
    }
    public static int[][] isTranspose(int[][] mat) {
        int[][] tarn = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <mat[0].length ; j++) {
              tarn[j][i]= mat[i][j];
            }
        }
        return tarn;
    }
}