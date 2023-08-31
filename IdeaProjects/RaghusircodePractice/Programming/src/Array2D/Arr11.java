package Array2D;
public class Arr11 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.readArray();
        System.out.println("user entered element is ");
        ao.Dispaly(x);
        int[] big = columnWiseBiggest(x);
        for (int i = 0; i < big.length; i++) {
            System.out.println(i + 1+" column wise Biggest  is "+big[i]);
        }
    }
    static int[] columnWiseBiggest(int[][] mat) {
        int big[] = new int[mat.length];
        for (int i = 0; i < mat[0].length; i++) {
            big[i] = mat[0][i];
            for (int j = 1; j <mat[0].length ; j++) {
                if (mat[j][i] > big[i]){
                    big[i] =mat[j][i];
                }
            }
        }
        return big;
    }
}
