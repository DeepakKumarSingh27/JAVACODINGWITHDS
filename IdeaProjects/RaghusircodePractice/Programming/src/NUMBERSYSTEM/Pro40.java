package NUMBERSYSTEM;

import java.util.Scanner;

public class Pro40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int pro=1;
        do {
            int d= n%10;
            pro*=d;
            n/=10;
        }while (n!=0);
        System.out.println(pro);
    }
}
