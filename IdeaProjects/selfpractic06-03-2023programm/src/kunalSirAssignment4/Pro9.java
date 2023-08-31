package kunalSirAssignment4;
import java.util.Scanner;
public class Pro9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number "+" !");
        int n=sc.nextInt();
       int fact= factorial(n);
        System.out.println(fact);
    }
    static int factorial(int n) {
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact*=i;
        }
       return fact;
    }
}
