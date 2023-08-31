package Array2D;
public class Arr3 {
    public static void main(String[] args) {
        ArrayOperation ao =new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered array is ");
        ao.Dispaly(x);
        int count= iscount(x);
        System.out.println("prime number in matrix is "+count);

    }
    static int iscount(int[][] x) {
        int count=0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                boolean rs= isPrime(x[i][j]);
                if (rs==true)
                    count++;
            }
        }
        return count;
    }
    static boolean isPrime(int x) {
        for (int i = 2; i <= x/2; i++) {
            if (x%i==0)
                return false;
        }
        return true;
    }
}
