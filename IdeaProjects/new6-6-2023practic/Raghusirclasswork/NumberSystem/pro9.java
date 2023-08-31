package Raghusirclasswork.NumberSystem;

import java.util.Scanner;

public class pro9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int t = n;
        int d1=n%10;
        int d2=n/10;
        int sp = d1+d2+d1*d2;
        if (n==sp)
            System.out.println("2D sp");
        else
            System.out.println("not 2D sp");
    }
}
