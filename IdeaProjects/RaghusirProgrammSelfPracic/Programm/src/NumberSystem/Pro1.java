package NumberSystem;
import java.util.Scanner;
public class Pro1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Addation is "+(a+b));
        System.out.println("substraction is "+(a-b));
        System.out.println("multliplication is "+a*b);
        System.out.println("Division is "+a/b);
        System.out.println("mudlo is "+a%b);
    }
}
