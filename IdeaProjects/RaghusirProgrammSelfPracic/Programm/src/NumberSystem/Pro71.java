package NumberSystem;
import java.util.Scanner;
public class Pro71 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int bin=Bintodec(n);
        System.out.println("Binary to decimal is "+bin);
    }
    static int Bintodec(int bin )
    {
        int dec=0,pow=1;
        do {
            int d=bin%10;
            dec=dec+d*pow;
            pow*=2;
            bin/=10;
        }while (bin!=0);
        return dec;
    }
}
