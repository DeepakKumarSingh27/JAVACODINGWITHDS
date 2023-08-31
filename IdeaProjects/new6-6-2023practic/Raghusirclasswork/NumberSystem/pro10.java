package Raghusirclasswork.NumberSystem;

import java.util.Scanner;

public class pro10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n <0)
            System.out.println(n+" is negative");
        else
            System.out.println(n+" is positive");
    }
}
