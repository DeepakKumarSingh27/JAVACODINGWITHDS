package RaghuSirHomePractic.NumberSystem;

import java.util.Scanner;

public class pro6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two number");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Addition is "+(a+b));
        System.out.println("Sub is"+(a-b) );
        System.out.println("prod is "+a*b);
        System.out.println("Div is "+a/b);
        System.out.println("mod is "+a%b);
    }
}
