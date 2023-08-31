package Raghusirclasswork.NumberSystem;

import java.util.Scanner;

public class pro13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n % 2==0)
            System.out.println("even");
        else System.out.println("odd");
    }
}
