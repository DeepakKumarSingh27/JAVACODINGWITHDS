package RaghuSirHomePractic.NumberSystem;

import java.util.Scanner;

public class pro7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int big = a>b?a:b;
        System.out.println(big);
    }
}
