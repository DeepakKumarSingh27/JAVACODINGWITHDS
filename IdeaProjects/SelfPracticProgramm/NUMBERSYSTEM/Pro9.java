package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if (n<0)
            System.out.println(n+" is negative number");
        else
            System.out.println(n+" is positive number");
    }
}
