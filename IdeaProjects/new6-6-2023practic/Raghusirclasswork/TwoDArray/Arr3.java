package Raghusirclasswork.TwoDArray;

public class Arr3 {
    public static void main(String[] args) {
        ArrayOperation aoo = new ArrayOperation();
        int[][] mat= aoo.readArray();
        System.out.println("user entered element is ");
        aoo.disp(mat);
        int count = primeCount(mat);
        System.out.println(count);
    }

    public static int primeCount(int[][] mat) {
        int count =0;
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                boolean rs = isPrime(mat[i][j]);
                if (rs){
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPrime(int x) {
        for (int i = 2; i <= x/2; i++) {
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
}
