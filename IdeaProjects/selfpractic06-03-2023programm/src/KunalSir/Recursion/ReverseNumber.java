package KunalSir.Recursion;
public class ReverseNumber {
    static int sum = 0;
    public static void Reverse1(int n){
        if (n == 0){
            return ;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        Reverse1(n / 10);
    }
    public static int Reverse2(int n){
     int digits = (int)(Math.log10(n)) + 1;
     return helper(n, digits);
    }
    static int helper(int n, int digits) {
        if (n%10 == n){
            return n;
        }
        int rem = n %10;
        return rem * (int)(Math.pow(10,digits-1))+helper(n/10,digits);
    }

    public static void main(String[] args) {
       int x = Reverse2(1234);
        System.out.println(x);

    }
}
