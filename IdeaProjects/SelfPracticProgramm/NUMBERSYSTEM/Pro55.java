package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro55 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
       String st=isXylem(n);
        System.out.println(st);
    }
    static String isXylem(int n)
    {
        int sd=0,md=0,t=n;
        do {
           int d=n%10;
           if (t==n||n<10)
               sd=sd+d;
           else
               md=md+d;
           n=n/10;
        }while (n!=0);
        if (sd==md)
            return "Xylem Number";
        else
            return "phloem Number";
    }
}
