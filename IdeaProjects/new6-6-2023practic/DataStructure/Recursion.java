package DataStructure;

public class Recursion {
    public static void main(String[] args) {
   int n = 5;
   int fact = isFactorial(n);
        System.out.println(fact);
    }

    public static int isFactorial(int n) {
        if (n == 1){
            return 1;
        }
        //return n * isFactorial(n-1);
        return n^(n-1);
    }
}
