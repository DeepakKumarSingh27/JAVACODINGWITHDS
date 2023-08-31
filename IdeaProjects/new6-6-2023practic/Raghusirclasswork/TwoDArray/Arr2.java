package Raghusirclasswork.TwoDArray;

public class Arr2 {
    public static void main(String[] args) {
        ArrayOperation aoo = new ArrayOperation();
        int[][] x= aoo.readArray();
        System.out.println("user entered element is ");
        aoo.disp(x);
        int sum = sumofMatrixEle(x);
        System.out.println(sum);
    }

    public static int sumofMatrixEle(int[][] mat) {
        int sum=0;
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum+=mat[i][j];
            }
        }
        return sum;
    }
}
