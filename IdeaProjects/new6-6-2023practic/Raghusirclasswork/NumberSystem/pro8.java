package Raghusirclasswork.NumberSystem;

import java.util.Scanner;

public class pro8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two values");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double big= (a>b)?a:b;
        System.out.println("Biggeest is "+big);
    }
}
