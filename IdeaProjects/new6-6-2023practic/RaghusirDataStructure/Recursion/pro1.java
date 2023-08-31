package RaghusirDataStructure.Recursion;

import java.util.Scanner;

public class pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        display(n);
    }

    public static void display(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        display(n-1);
    }
}
