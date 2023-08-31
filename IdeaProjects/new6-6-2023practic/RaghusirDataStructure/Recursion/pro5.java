package RaghusirDataStructure.Recursion;
public class pro5 {
    public static void main(String[] args) {
        boolean rs = isPrime(17);
        if (rs) System.out.println("Prime");
        else System.out.println("not prime");
    }

    public static boolean isPrime(int n) {
        return isPrime(2,n);
    }
    public static boolean isPrime(int i,int n) {
        if (n % i == 0) {
            return false;
        }
        if (i > n/2) {
            return true;
        }
        return isPrime(i+1,n);
    }
}
