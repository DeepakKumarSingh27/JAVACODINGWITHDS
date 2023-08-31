package Raghusirclasswork.NumberSystem;

import java.util.Scanner;

public class pro5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temp in form of cel");
        int c = sc.nextInt();
        int f = (c*9)/5+32;
        System.out.println(f);

    }
}
