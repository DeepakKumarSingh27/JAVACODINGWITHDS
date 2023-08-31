package Raghusirclasswork.NumberSystem;

import java.util.Scanner;

public class pro12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b)
            System.out.println("Biggest is"+a);
        else System.out.println("Biggest is "+b);
    }
}
