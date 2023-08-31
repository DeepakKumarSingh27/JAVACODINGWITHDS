package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if (n>=10 && n<=99)
            System.out.println("Two Digit Number");
        else
            System.out.println("not two Digit number");
    }
}
