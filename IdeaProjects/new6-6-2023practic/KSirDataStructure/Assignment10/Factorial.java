package KSirDataStructure.Assignment10;
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n) {
        // Write your code here
        if(n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
