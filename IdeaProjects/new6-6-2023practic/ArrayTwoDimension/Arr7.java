package ArrayTwoDimension;
public class Arr7 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.ReadArray();
        System.out.println("user entered array element is ");
        ao.DisplayArray(x);
        int[][] tr = isTranspose(x);
        System.out.println("Transpose of matrix is");
        ao.DisplayArray(tr);
    }

    public static int[][] isTranspose(int[][] mat) {
        int[][] tr = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
               tr[j][i] = mat[i][j];
            }
        }
        return tr;
    }
}
