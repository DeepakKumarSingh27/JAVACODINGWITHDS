package Raghusirclasswork.NumberSystem;

import java.util.Scanner;

public class pro7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Amount");
        int amt = sc.nextInt();
        System.out.println("Rupees 500 is "+amt/500);
        amt%=500;
        System.out.println("Rupees 10 is "+amt/10);
        amt%=10;
    }
}
