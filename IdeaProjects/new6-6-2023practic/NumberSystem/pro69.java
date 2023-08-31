package NumberSystem;

import java.util.Scanner;

public class pro69 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int oct = octalToDecimal(n);
        System.out.println("Octal to Decimal is "+oct);
    }

    public static int octalToDecimal(int n) {
        int dec =0,p=0;
        do {
            int r = n%10;
            dec = dec+r*(int) Math.pow(8,p);
            p++;
            n/=10;
        }while (n!=0);
        return dec;
    }
}
