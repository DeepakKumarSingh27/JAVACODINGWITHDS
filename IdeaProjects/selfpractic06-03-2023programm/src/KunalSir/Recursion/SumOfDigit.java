package KunalSir.Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        int ans = sumOfDigit(1242);
        System.out.println(ans);
    }
    public static int sumOfDigit(int n){
        if (n == 0){
            return 0;
        }
        return (n % 10) + sumOfDigit(n / 10);
    }
}
