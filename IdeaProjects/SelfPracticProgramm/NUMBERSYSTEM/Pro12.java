package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n>18)
            System.out.println("you are eligible for vote");
        else
            System.out.println("you are not eligible for vote");

    }
}
