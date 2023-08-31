package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount");
        int a=sc.nextInt();
        System.out.println("Rupees 500 is "+a/500);
        a%=500;
        System.out.println("Rupees 200 is "+a/200);
        a%=200;
        System.out.println("Rupees 100 is "+a/100);
        a%=100;
        System.out.println("Rupees 50 is "+a/50);
        a%=50;
    }
}
