package NUMBERSYSTEM;
import java.util.Map;
import java.util.Scanner;
public class Pro65 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        String st= sc.nextLine();
        int dec=hexToDec(st);
        System.out.println("Hexa to Decimal is "+dec);
    }
    static int hexToDec(String hx)
    {
        int dec=0,p=0;
        for (int i=hx.length()-1;i>=0;i--)
        {
            char ch=hx.charAt(i);
            int d=0;
            if (ch>='0' &&ch<='9')
                d=ch-48;
            else if (ch>='a'&& ch<='z')
                d=ch-87;
            else if (ch>='A' && ch<='Z')
                d=ch-55;
            dec=dec+d*(int)Math.pow(16,p);
            p++;
        }
        return dec;
    }
}
