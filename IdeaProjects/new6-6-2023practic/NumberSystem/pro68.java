package NumberSystem;

import java.util.Scanner;

public class pro68 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int bin = binaryToDecimal(n);
        System.out.println("Binary to Decimal is "+bin);
    }

    public static int binaryToDecimal(int n) {
       int dec =0,p=0;
       do {
           int r = n%10;
           dec = dec+r*(int) Math.pow(2,p);
           p++;
           n/=10;
       }while (n!=0);
       return dec;
    }
}
