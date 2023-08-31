package ArrayTwoDimension;
public class Arr11 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.ReadArray();
        System.out.println("user entered array element is ");
        ao.DisplayArray(x);
        int[] big = rowWiseBiggest(x);
        for (int i = 0; i < big.length; i++) {
            System.out.println(i+1+" Row wise Biggest is "+big[i]);

        }
    }

    public static int[] rowWiseBiggest(int[][] mat) {
        int[] big = new int[mat[0].length];
        for (int i = 0; i < mat[0].length; i++) {
            big[i] = mat[i][0];
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] > big[i]) {
                    big[i] = mat[i][j];
                }
            }
        }
        return big;
    }
}
