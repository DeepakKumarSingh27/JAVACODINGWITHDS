package NumberSystem;

import java.util.Scanner;

public class pro20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n>=10 && n <=99)
            System.out.println("2 Digit Number");
        else System.out.println("Not 2 Digit Number");
    }
}
