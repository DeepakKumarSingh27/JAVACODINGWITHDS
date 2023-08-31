package Raghusirclasswork.NumberSystem;

import java.util.Scanner;

public class pro47 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        sumofFNat(n);
    }

    public static void sumofFNat(int n) {
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
