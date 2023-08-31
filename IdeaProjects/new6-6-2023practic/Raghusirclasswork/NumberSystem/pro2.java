package Raghusirclasswork.NumberSystem;

import java.util.Scanner;

public class pro2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Radius");
        int r = sc.nextInt();
        System.out.printf("Area is %.3f",3.14*r*r);
        System.out.println();
        System.out.println("circumstance is "+2*3.14*r);
    }
}
