package KSirDataStructure.Recursion;
public class NumbersExample {
    public static void main(String[] args) {
        fib(5);
    }
    static void print(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        print(--n);
        System.out.println(n);

    }
   static void fib(int n){
       if (n == 1){
           return;
       }
     //  fib(n) = fib(n-1) + fib(n-2);
   }
}
