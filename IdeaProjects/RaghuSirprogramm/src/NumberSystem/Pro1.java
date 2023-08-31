package NumberSystem;
import java.util.Scanner;
public class Pro1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second Number:");
        int b=sc.nextInt();
        System.out.println("Add is "+(a+b));
        System.out.println("sub is "+(a-b));
        System.out.println("mult is "+a*b);
        System.out.println("div is "+a/b);
        System.out.println("mod is "+a%b);
    }
}
