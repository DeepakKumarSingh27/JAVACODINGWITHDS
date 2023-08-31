package KunalsirAssignment5;
public class Arr14 {
    public static void main(String[] args) {
      // int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {{1,2,3},{4,5,6}};
       int[][] ans=transpose(matrix);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j <  ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
     int[][] tra=new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
             tra[j][i]=matrix[i][j];
            }
        }
        return tra;
    }
}
