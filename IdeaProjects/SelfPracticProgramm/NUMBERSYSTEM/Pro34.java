package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int count=0;
        do {
            n/=10;
            count++;

        }while (n!=0);
        System.out.println(count);
    }
}
