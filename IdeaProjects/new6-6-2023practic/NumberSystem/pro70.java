package NumberSystem;

import java.util.Scanner;

public class pro70 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        String n = sc.next();
        int hx = hexaToDecimal(n);
        System.out.println("Hexa to Decimal is "+hx);
    }

    public static int hexaToDecimal(String hx) {
        int dec=0,p=0;
        for (int i=hx.length()-1;i>=0;i--)
        {
            char ch=hx.charAt(i);
            int d=0;
            if (ch>='0' && ch<='9')
                d=ch-48;
            if (ch>='A' && ch<='Z')
                d=ch-55;
            if (ch>='a' && ch<='z')
            d=ch-87;
            dec= dec+d*(int) Math.pow(16,p);
            p++;
        }
        return dec;
    }
}
