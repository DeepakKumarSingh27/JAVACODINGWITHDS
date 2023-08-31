package NumberSystem;
import java.util.Scanner;
public class Pro49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        diviser(n);
    }
    static void diviser(int n) {
        int count=0;
        for (int i = 1; i <= n; i++) {
           if (n%i==0)
               count++;
        }
        System.out.println(count);
    }
}
