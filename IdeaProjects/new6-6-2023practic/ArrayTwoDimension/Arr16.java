package ArrayTwoDimension;
public class Arr16 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.ReadArray();
        System.out.println("user entered Array element is ");
        ao.DisplayArray(x);
        int[] big = diagonalWiseSum(x);
        System.out.println("primary Diagonal sum is "+big[0]);
        System.out.println("Secondary Diagonal sum is "+big[1]);

    }

    public static int[] diagonalWiseSum(int[][] mat) {
        int Psum = 0, Ssum = 0;
        for (int i = 0; i < mat.length; i++) {
            Psum += mat[i][i];
            Ssum += mat[i][mat.length-1-i];
        }
        int[] big={Ssum,Psum};
        return big;
    }
}
