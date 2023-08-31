package KunalSir.Recursion;
public class ProductOfDigit {
    public static void main(String[] args) {
        int ans = productOfDigit(505);
        System.out.println(ans);
    }
    public static int productOfDigit(int n){
        if (n%10 == n){
            return n;
        }
        return (n % 10) * productOfDigit(n / 10);
    }
}
