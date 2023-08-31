package Raghusirclasswork.NumberSystem;

import java.util.Scanner;

public class pro19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three number");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int small = (a<b&&a<c)?a:b<c?b:c;
        System.out.println(small);
    }
}
