package Raghusirclasswork.NumberSystem;

import java.util.Scanner;

public class pro25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int t = n,sum=0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i ==0)
                sum+=i;
        }
        if (sum==t)
            System.out.println("perfect");
        else System.out.println("not per");
    }
}
