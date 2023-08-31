package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int fact=isFactorial(n);
        System.out.println("factorial of "+n+" is "+fact);
    }
    static int isFactorial(int n)
    {
        int fact=1;
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}
