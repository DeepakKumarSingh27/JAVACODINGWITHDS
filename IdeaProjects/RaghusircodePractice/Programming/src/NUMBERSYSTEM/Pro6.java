package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Number");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("Addition is "+(a+b));
        System.out.println("Subtraction is "+(a-b));
        System.out.println("multiplication is "+(a*b));
        System.out.println("Division is "+(a/b));
        System.out.println("modulo is "+(a%b));
    }
}
