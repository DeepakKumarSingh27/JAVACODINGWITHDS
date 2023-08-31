package Raghusirclasswork.NumberSystem;

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0,t=n;
        do {
            int d = n%10;
            sum+=d*d*d;
            n/=10;
        }while (n!=0);
        if (sum==t)
            System.out.println("arm");
        else System.out.println("not arm");
    }
}
