package ArrayTwoDimension;
public class Arr12 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.ReadArray();
        System.out.println("user entered array element is ");
        ao.DisplayArray(x);
        int[] big = colWiseBiggest(x);
        for (int i = 0; i < big.length; i++) {
            System.out.println(i+1+" col wise Biggest is "+big[i]);

        }
    }

    public static int[] colWiseBiggest(int[][] mat) {
        int[] big = new int[mat[0].length];
        for (int i = 0; i < mat[0].length; i++) {
            big[i] = mat[0][i];
            for (int j = 0; j < mat.length; j++) {
                if (mat[j][i] > big[i]) {
                    big[i] = mat[j][i];
                }
            }
        }
        return big;
    }
}
