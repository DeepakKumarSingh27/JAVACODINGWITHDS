package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int dec=binToDec(n);
        System.out.println("Binary to Decimal is "+dec);
    }
    static int binToDec(int n)
    {
     /*
     1101->
     (1*2^3+1*2^2+0*2^1+1*2^0)13
      */
        int dec=0,p=0;
        do {
            int d=n%10;
            dec+=d*(int)Math.pow(2,p);
            p++;
            n=n/10;
        }while (n!=0);
        return dec;
    }
}
