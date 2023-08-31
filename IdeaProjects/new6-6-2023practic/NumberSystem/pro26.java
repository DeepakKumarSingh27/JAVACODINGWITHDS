package NumberSystem;

import java.util.Scanner;

public class pro26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int f = sc.nextByte();
        int fact = 1;
        for (int i = 1; i <= f; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
