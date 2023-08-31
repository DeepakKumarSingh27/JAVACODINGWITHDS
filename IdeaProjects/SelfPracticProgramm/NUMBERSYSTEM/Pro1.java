package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 Integer Number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("addition is "+ (a+b));
        System.out.println("sub is "+(a-b));
        System.out.println("mult is "+a*b);
        System.out.println("Div is "+a/b);
        System.out.println("mod is "+a%b);
    }
}
