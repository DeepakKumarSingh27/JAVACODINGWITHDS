package NumberSystem;
import java.util.Scanner;
public class Pro6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        double n=sc.nextDouble();
        System.out.println("Enter second number");
        double m=sc.nextDouble();
        System.out.println("Addition is "+(n+m));
        System.out.println("Subtraction is "+(n-m));
        System.out.println("multiplication is "+ n*m);
        System.out.println("Division is "+(n/m));
        System.out.println("Modulo is "+(n%m));
    }
}
