package NUMBERSYSTEM.PrimeNumber;

import java.util.Scanner;

public class Pro6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int pro=isProduct(n);
        System.out.println("Product of Digit is "+pro);
    }
    static int isProduct(int n)
    {
        int pro=1;
        do {
            int r=n%10;
            pro=pro*r;
            n/=10;
        }while (n!=0);
        return pro;
    }
}
