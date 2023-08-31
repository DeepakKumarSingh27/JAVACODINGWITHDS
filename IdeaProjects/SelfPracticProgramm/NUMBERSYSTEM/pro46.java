package NUMBERSYSTEM;

import java.util.Scanner;

public class pro46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=isSum(n);
        System.out.println("sum of first natural number is "+sum);
    }
    static int isSum(int n)
    {
        int sum=0;
       for (int i=1;i<=n;i++)
       {
           sum=sum+i;
       }
        return sum;
    }
}
