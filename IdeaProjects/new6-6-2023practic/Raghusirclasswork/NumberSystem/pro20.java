package Raghusirclasswork.NumberSystem;

import java.util.Scanner;

public class pro20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n >=1&&n<=9)
            System.out.println("not 2 digit");
        else System.out.println("2Digit");
    }
}
