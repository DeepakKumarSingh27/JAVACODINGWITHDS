package NUMBERSYSTEM;
import java.util.Scanner;
public class pro7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int big=a>b?a:b;
        System.out.println("Biggest Number is "+big);
    }
}
