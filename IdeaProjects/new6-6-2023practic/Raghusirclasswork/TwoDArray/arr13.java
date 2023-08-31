package Raghusirclasswork.TwoDArray;
public class arr13 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] mat = ao.readArray();
        System.out.println("user entered element is ");
        ao.disp(mat);
        int[][] rev=rowWiseRev(mat);
        System.out.println("row wire rev is ");
        ao.disp(rev);
    }
    public static int[][] rowWiseRev(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int start = 0, end = mat.length-1;
            while (start < end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }
        return mat;
    }
}
