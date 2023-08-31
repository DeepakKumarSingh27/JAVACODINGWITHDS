package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 Number");
        int a=sc.nextInt();
        int b =sc.nextInt();
        if (a==b)
            System.out.println("equals");
        else
            System.out.println("not equal");
    }
}
