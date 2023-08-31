package KSirDataStructure.Recursion;
public class fibo {
    public static void main(String[] args) {

        System.out.println(fib(48));
    }
    public static int  fib(int n) {
        if (n==1) {
            return 0;
        }
        if (n==2) {
            return 1;
        }
        return  fib(n-1) + fib(n-2);
    }
}
