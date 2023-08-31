package Raghusirclasswork.TwoDArray;

public class Arr14 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] mat = ao.readArray();
        System.out.println("user entered element is ");
        ao.disp(mat);
        int[][] rev=colWiseRev(mat);
        System.out.println("col wire rev is ");
        ao.disp(rev);
    }
    public static int[][] colWiseRev(int[][] mat) {
        for (int i = 0; i < mat[0].length; i++) {
            int start = 0, end = mat.length-1;
            while (start < end) {
                int temp = mat[start][i];
                mat[start][i] = mat[end][i];
                mat[end][i] = temp;
                start++;
                end--;
            }
        }
        return mat;
    }
}
