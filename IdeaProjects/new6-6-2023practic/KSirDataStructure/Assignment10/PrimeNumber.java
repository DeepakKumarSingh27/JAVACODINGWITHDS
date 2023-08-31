package KSirDataStructure.Assignment10;
public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 2; i <= 40; i++) {
            boolean rs = Prime(i);
            if (rs)
            System.out.print(i+" ");
        }
    }
    public static boolean Prime(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
