package NUMBERSYSTEM;

import java.util.Scanner;

import static NUMBERSYSTEM.Pro44.isFactorial;

public class pro50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean rs=isStrong(n);
        if (rs==true)
            System.out.println(n+" is strong number");
        else
            System.out.println(n+" is not strong number");
    }
    static boolean isStrong(int n)
    {
        int sum=0,temp=n;
        while (n!=0)
        {
            int d=n%10;
            sum=sum+isFactorial(d);
            n/=10;
        }
        return sum==temp;
    }
}
