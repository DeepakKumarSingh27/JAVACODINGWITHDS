package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
//        for (int i=1;i<=n;i++)
//        {
//            if (i%2==0)
//                System.out.print(i+" ");
//        }
        for (int i=2;i<=n;i=i+2)
            System.out.print(i+" ");
        System.out.println();
        for (int i=1;i<=n;i=i+2)
            System.out.print(i+" ");
    }
}
