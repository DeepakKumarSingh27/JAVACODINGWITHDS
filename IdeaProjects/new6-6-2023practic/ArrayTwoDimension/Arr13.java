package ArrayTwoDimension;
public class Arr13 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.ReadArray();
        System.out.println("user entered array element is ");
        ao.DisplayArray(x);
        int[] big = colWiseSum(x);
        for (int i = 0; i < big.length; i++) {
            System.out.println(i+1+" col wise sum is "+big[i]);
        }
    }

    public static int[] colWiseSum(int[][] mat) {
        int[] sum = new int[mat[0].length];
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                    sum[i] += mat[j][i];
            }
        }
        return sum;
    }
}
