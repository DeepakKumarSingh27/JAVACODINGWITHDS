package NUMBERSYSTEM;
import java.util.Scanner;
public class pro62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        String st=decToHex(n);
        System.out.println("Decimal to Hexa is "+st);
    }
    static String decToHex(int n)
    {
        String hx=" ";
        do {
            int d=n%16;
            if (d<10)
                hx=d+hx;
            else
               hx=(char)(d+55)+hx;
            n=n/16;
        }while (n!=0);
        return hx;
    }
}
