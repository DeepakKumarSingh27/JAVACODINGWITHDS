package NumberSystem;

import java.util.Scanner;

public class pro16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the month number");
        int m = sc.nextInt();
        if (m >=1 && m <= 12) System.out.println("valid");
        else System.out.println("invalid");
    }
}
