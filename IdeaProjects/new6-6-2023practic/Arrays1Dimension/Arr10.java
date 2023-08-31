package Arrays1Dimension;
public class Arr10 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[] x= ao.ReadArray();
        System.out.println("user entered element is ");
        ao.DisplayArray(x);
        int ct = primeCount(x);
        System.out.println(ct);
    }

    public static int primeCount(int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            boolean rs = primeNumber(ar[i]);
            if (rs == true)
                count++;
        }
        return count;
    }

    public static boolean primeNumber(int x) {
        for (int i = 2; i <= x/2; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
