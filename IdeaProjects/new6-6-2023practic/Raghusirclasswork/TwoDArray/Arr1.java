package Raghusirclasswork.TwoDArray;
public class Arr1 {
    public static void main(String[] args) {
    ArrayOperation aoo = new ArrayOperation();
    int[][] x= aoo.readArray();
        System.out.println("user entered element is ");
        aoo.disp(x);
        int big = isBiggest(x);
        System.out.println(big);
    }
    public static int isBiggest(int[][] mat) {
        int big= mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > big) big= mat[i][j];
            }
        }
        return big;
    }
}
