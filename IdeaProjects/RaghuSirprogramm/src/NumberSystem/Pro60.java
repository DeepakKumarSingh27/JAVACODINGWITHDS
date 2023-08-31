package NumberSystem;

import java.util.Scanner;

public class Pro60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        String st=isxylomph(n);
        System.out.println(st);
    }
    static String isxylomph(int n)
    {
        int fs=0,ms=0,temp=n;
       do {
           int d=n%10;
           if (temp==n||n<10)
               fs=fs+d;
           else
               ms=ms+d;
           n=n/10;
       }while (n!=0);
       if (fs==ms)
           return "xylom";
       else
           return "pholem";
    }
}
