package Array2D;
public class Arr6 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        System.out.println("Enter first matrix ");
        int[][] x = ao.readArray();
        System.out.println("Enter second matrix");
        int[][] y = ao.readArray();
        System.out.println("user entered first element is ");
        ao.Dispaly(x);
        System.out.println("user entered second element is ");
        ao.Dispaly(y);
        int[][] z = addMatrix(x,y);
        System.out.println("Addition of matrix is ");
        ao.Dispaly(z);
    }
    static int[][] addMatrix(int[][] x, int[][] y) {
        int[][] z = new int[x.length][x[0].length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                z[i][j] = x[i][j] + y[i][j];
            }
        }
        return z;
    }
}