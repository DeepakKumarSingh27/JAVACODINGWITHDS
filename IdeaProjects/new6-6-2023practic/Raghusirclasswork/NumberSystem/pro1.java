package Raghusirclasswork.NumberSystem;

import java.util.Scanner;

public class pro1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Add "+(a+b));
        System.out.println("sub "+(a-b));
        System.out.println("mult "+(a*b));
        System.out.println("div "+(a/b));
        System.out.println("modulo "+(a%b));

    }
}
