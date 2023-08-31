package ArrayTwoDimension;
public class Arr8 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        System.out.println("Enter first matrix size");
        int[][] x = ao.ReadArray();
        System.out.println("Enter second matrix size");
        int[][] y = ao.ReadArray();
        System.out.println("user entered first array element is ");
        ao.DisplayArray(x);
        System.out.println("user entered second array element is ");
       ao.DisplayArray(y);
       int[][] mat = addMatrix(x,y);
        System.out.println("After Adding two matrix is ");
        ao.DisplayArray(mat);
    }

    public static int[][] addMatrix(int[][] x, int[][] y) {
        if (x.length != y.length || x[0].length != y[0].length) {
            return null;
        }
        int[][] mat = new int[x.length][y.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = x[i][j] + y[i][j];
            }
        }
        return mat;
    }
}
