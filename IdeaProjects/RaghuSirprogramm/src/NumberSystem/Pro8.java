package NumberSystem;

import java.util.Scanner;

public class Pro8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number:");
        int a=sc.nextInt();
        System.out.println("Enter second Number:");
        int b=sc.nextInt();
        int big=(a>b)?a:b;
        System.out.println("Biggest Number is: "+big);
    }
}
