package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int y=sc.nextInt();
        if (y%4==0&&y%100!=0||y%400==0)
            System.out.println(y+" is leap year");
        else
            System.out.println(y+" is not leap year");
    }
}
