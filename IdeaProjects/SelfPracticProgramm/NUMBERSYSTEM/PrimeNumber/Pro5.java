package NUMBERSYSTEM.PrimeNumber;

import java.util.Scanner;

public class Pro5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int s1=sumOfDigit(n);
        System.out.println("sum of Digit is "+s1);
    }

    static int sumOfDigit(int n)
    {
        int sum=0;
        while (n!=0)
        {
           int r=n%10;
           sum=sum+r;
           n/=10;
        }
        return sum;
    }
}
