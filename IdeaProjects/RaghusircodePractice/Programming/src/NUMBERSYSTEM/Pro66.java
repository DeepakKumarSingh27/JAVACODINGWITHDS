package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro66 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        String dec=octal(n);
        System.out.println(dec);
    }
    static String octal(int dec) {
        String oct="";
        do {
            int d=dec%8;
            oct=d+oct;
            dec/=8;
        }while (dec!=0);
        return oct;
    }
}
