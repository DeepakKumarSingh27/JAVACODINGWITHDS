package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Month number");
        int m=sc.nextInt();
        if (m>=1 && m<=12)
            System.out.println(m+" is valid ");
        else
            System.out.println(m+" is   invalid");

    }
}
