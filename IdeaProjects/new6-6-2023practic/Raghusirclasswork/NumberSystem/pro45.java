package Raghusirclasswork.NumberSystem;

import java.util.Scanner;

public class pro45 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        sunofDigits(n);
    }

    public static void sunofDigits(int n) {
        int sum=0;
        do {
            int d = n%10;
            sum+=d;
            n/=10;
        }while (n!=0);
        System.out.println(sum);
    }
}
