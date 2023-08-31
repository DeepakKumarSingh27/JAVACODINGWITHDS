package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro45 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int pro=isProdigit(n);
        System.out.println("product of Digit is "+pro);
    }

     static int isProdigit(int n)
     {
         int pro=1;
         do {
             int d=n%10;
             pro=pro*d;
             n=n/10;
         }while (n!=0);
         return pro;
    }
}
