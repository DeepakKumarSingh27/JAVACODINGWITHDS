package NumberSystem._NumberConversion;
import java.util.Scanner;
public class octtodec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int oct=octToDec(n);
        System.out.println("octoal to decimal of "+n+" is "+oct);
    }
    static int octToDec(int oct)
    {
       int dec=0,p=0;
       do {
           int r=oct%10;
           dec=dec+r*(int)Math.pow(8,p);
           p++;
           oct/=10;
       }while (oct!=0);
       return dec;
    }
}
