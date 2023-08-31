package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int edig=0,odig=0;
        do {
            int d=n%10;
            if (d%2==0)
                edig++;
            else
                odig++;
            n=n/10;
        }while (n!=0);
        System.out.println("Even digit is "+edig);
        System.out.println("odd digit is "+odig);
    }
}
