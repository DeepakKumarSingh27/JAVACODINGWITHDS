package KunalSir.Recursion1;
public class FibonacciNumber {
    public static void main(String[] args) {
       // int ans=fibo(5);
        //System.out.println(ans);
//        for (int i = 1; i < 11; i++) {
//            System.out.println(fiboformula(i));
            System.out.println(fiboformula(50));
       // }
    }
    static int fiboformula(int n){
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2 ),n) / Math.sqrt(5));
    }
    static int fibo(int n){
        if (n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
