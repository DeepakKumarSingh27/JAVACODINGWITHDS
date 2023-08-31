package NumberSystem;

import java.util.Scanner;

public class pronumbervalidornot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  number");
        int m = sc.nextInt();
        if (m >=1 && m <= 9) System.out.println("Digit");
        else System.out.println("Number");
    }
}
