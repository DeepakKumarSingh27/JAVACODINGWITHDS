package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro64 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int dec=octToDec(n);
        System.out.println("octal to decimal is "+ dec);
    }
    static int octToDec(int n)
    {
     int dec=0,p=0; //35
     do {
         int d=n%10;
         dec+=d*(int)Math.pow(8,p);
         p++;
         n=n/10;
     }while (n!=0);
     return dec;
    }
}
