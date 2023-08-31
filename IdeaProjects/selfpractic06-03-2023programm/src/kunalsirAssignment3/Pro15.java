package kunalsirAssignment3;
import java.util.Scanner;
public class Pro15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N");
        int n=sc.nextInt();
        System.out.println("Enter the R");
        int r=sc.nextInt();
        System.out.println("nCr = " + nCr(n, r));
        System.out.println("nPr = " + nPr(n, r));
    }
    // Function to calculate factorial of a number
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to calculate nCr
    static int nCr(int n, int r) {
        if (r > n) {
            return 0;
        }
        int num = factorial(n);
        int den = factorial(r) * factorial(n - r);
        return num / den;
    }

    // Function to calculate nPr
    static int nPr(int n, int r) {
        if (r > n) {
            return 0;
        }
        int num = factorial(n);
        int den = factorial(n - r);
        return num / den;
    }

}
