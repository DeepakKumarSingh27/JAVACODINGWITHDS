package NumberSystem;
import java.io.PrintStream;
import java.util.Scanner;
public class Pro43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int prod=1;
        do {
            int d=n%10;
            prod*=d;
            n=n/10;
        }while (n!=0);
        System.out.println("product of digit is: "+prod);
    }
}
