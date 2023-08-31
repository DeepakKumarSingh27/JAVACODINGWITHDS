package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int big=(a>b&&a>c)?a:b>c?b:c;
        int small=(a<b&&a<c)?a:b<c?b:c;
        int midd=(a+b+c)-(big+small);
        System.out.println("middle number is "+midd);
    }
}
