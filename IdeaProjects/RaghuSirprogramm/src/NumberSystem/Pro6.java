package NumberSystem;

import java.util.Scanner;

public class Pro6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number:");
        double d=sc.nextDouble();
        System.out.println("Enter second Number:");
        double d1=sc.nextDouble();
        System.out.println("Add is "+(d+d1));
        System.out.println("sub is "+(d-d1));
        System.out.println("mult is "+(d*d1));
        System.out.println("div is "+(d/d1));
        System.out.println("mod is "+(d%d1));

    }
}
