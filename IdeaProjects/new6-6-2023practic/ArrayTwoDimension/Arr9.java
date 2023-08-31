package ArrayTwoDimension;
public class Arr9 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.ReadArray();
        System.out.println("user entered array element is ");
        ao.DisplayArray(x);
        int[] ct =evenOddCount(x);
        System.out.println("Even "+ct[0]);
        System.out.println("Odd "+ct[1]);
    }

    public static int[] evenOddCount(int[][] mat) {
        int ec=0,oc=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] % 2 == 0) {
                    ec++;
                } else {
                    oc++;
                }
            }
        }
        int[] ct = {ec,oc};
        return ct;
    }
}
