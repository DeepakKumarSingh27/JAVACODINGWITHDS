package Raghusirclasswork.NumberSystem;

import java.util.Scanner;

public class validinvalidmonth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n >=1 && n <=12)
            System.out.println("valid");
        else System.out.println("invalid");
    }
}
