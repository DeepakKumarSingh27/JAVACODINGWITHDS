package NumberSystem;

import java.util.Scanner;

public class Pro56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Enter the power ");
        int m=sc.nextInt();
        int pw=isPower(n,m);
        System.out.println(n+" power is "+pw);
    }
    static int isPower(int n, int p)
    {
        int pow=1;
     while(p>0)
     {
       pow*=n;
       p--;
     }
     return pow;
    }
}
