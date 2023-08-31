package Array2D;
public class Arr5 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.readArray();
        System.out.println("user entered  element is ");
        ao.dispArray(x);
        int[][] z = isTranspose(x);
        System.out.println("Transpose of matrix is ");
        ao.Dispaly(z);
    }
    static int[][] isTranspose(int[][] mat) {
        int[][] tr = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                tr[j][i] = mat[i][j];
            }
        }
        return tr;
    }
}
