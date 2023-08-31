package Raghusirclasswork.NumberSystem;

import java.util.Scanner;

public class pro16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n >= 1 && n <=9)
            System.out.println("Dig");
        else System.out.println("num");
    }
}
