package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro57 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int ct=primeCount(n);
        System.out.println("prime number present with in "+n+" is "+ct);
    }
    static int primeCount(int n)
    {
        int count=0;
        for (int i=1;i<=n;i++)
        {
            boolean rs=isPrime(i);
            if (rs==true)
                count++;
        }
        return count;
    }
    static boolean isPrime(int x)
    {
        for (int i=2;i<=x/2;i++)
        {
           if (x%i==0)
               return false;
        }
        return true;
    }
}
