package NUMBERSYSTEM;

import java.util.Scanner;

public class pro29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for (int i=n;i>=1;i--)
        {
            System.out.print(i+" ");
        }
    }
}
