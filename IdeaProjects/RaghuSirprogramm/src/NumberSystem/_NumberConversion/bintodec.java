package NumberSystem._NumberConversion;
import java.util.Scanner;
public class bintodec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int dec=binToDec(n);
        System.out.println("binary to decimal of "+n+" is "+dec);
    }
    static int binToDec(int bin)
    {
        int dec=0,p=0;
        do{
            int r=bin%10;
            dec=dec+r*(int)Math.pow(2,p);
            p++;
            bin=bin/10;
        }while (bin!=0);
        return dec;
    }
}
