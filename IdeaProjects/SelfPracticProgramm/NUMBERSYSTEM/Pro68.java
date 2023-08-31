package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro68 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int fib=isFib(n);
        System.out.println("fibnacci number is "+fib);
    }
    static int isFib(int n)
    {
        int f1=0,f2=1;
        while (n>1)
        {
            int f3=f1+f2;
            f1=f2;
            f2=f3;
            n--;
        }
        return f1;
    }
}
