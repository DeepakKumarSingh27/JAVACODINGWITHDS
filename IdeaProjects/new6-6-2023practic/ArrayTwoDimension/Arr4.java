package ArrayTwoDimension;
public class Arr4 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x= ao.ReadArray();
        System.out.println("user entered array element is ");
        ao.DisplayArray(x);
        int pm = PrimeCount(x);
        System.out.println(pm);
    }
    public static int PrimeCount(int[][] mat) {
        int count =0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                boolean rs = isPrime(mat[i][j]);
                if (rs) {
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isPrime(int x) {
        for (int i = 2; i <= x/2; i++) {
            if (x % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
