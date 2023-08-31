package KunalsirAssignment5;
public class Arr19 {
    public static void main(String[] args) {
//        int[][] mat = {{0,1},{1,0}};
//        int[][] target ={{1,0},{0,1}};
        int[][] mat = {{0, 1}, {1, 1}}; //
        int[][] target = {{1, 0}, {0, 1}};
//        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
//        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        boolean rs = findRotation(mat, target);
        if (rs)
            System.out.println(rs);
        else
            System.out.println(rs);
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int[][] x = transpose(mat);
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (check(mat, target)) {
                    return true;
                }
                rowwiserevse(x);
            }
        }
        return false;
    }

    public static void rowwiserevse(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            int f = 0, l = x[i].length - 1;
            while (f < l) {
                int temp = x[i][f];
                x[i][f] = x[i][l];
                x[i][l] = temp;
                f++;
                l--;
            }
        }
    }

    public static int[][] transpose(int[][] arr) {
        int[][] tra = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tra[j][i] = arr[i][j];
            }
        }
        return tra;
    }

    static boolean check(int[][] matrix, int[][] target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
