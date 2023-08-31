package NUMBERSYSTEM;

import java.util.Map;
import java.util.Scanner;

public class Pro68 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n =sc.nextInt();
        int bin= isDecimal(n);
        System.out.println(bin);
    }

    static int isDecimal(int n) {
        int dec=0,p=0;
        do {
            int r=n%10;
            dec=dec+r*(int)Math.pow(2,p);
            p++;
            n/=10;
        }while (n!=0);
        return dec;
    }
}
