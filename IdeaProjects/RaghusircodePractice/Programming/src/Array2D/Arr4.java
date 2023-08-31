package Array2D;
public class Arr4 {
    public static void main(String[] args) {
        ArrayOperation ao =new ArrayOperation();
        int[][] x = ao.readArray();
        System.out.println("user entered element is ");
        ao.dispArray(x);
        int[][] z = getSum(x);
        ao.Dispaly(z);
    }
    static int[][] getSum(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                int sum = 0;
                do {
                    int d = mat[i][j] % 10;
                    sum += d;
                    mat[i][j] /= 10;
                } while (mat[i][j] != 0);
                mat[i][j] = sum;
            }
        }
        return mat;
    }
}
