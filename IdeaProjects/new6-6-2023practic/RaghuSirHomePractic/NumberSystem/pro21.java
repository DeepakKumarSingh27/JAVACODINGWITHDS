package RaghuSirHomePractic.NumberSystem;

import java.util.Scanner;

public class pro21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three number");
        int a= sc.nextInt();
        int b =sc.nextInt();
        int c= sc.nextInt();
        int small = (a<b && a<c)?a:b<c?b:c;
        int big=(a>b && a>c)?a:b>c?b:c;
        int mid = big + (small - big)/2;
        System.out.println(mid);
    }
}
