package NumberSystem;

import java.util.Scanner;

public class Pro39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int ec=0,oc=0;
        do {
           int d=n%10;
           if (d%2==0)
               ec++;
           else
               oc++;
           n/=10;
        }while (n!=0);
        System.out.println("Even Digits are "+ec);
        System.out.println("odd digits are: "+oc);
    }
}
