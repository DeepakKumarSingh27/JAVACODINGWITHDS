package NumberSystem;

import java.util.Scanner;

public class pro1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Addition is "+ (a+b));
        System.out.println("Subtraction is "+ (a-b));
        System.out.println("multiplication is "+ (a*b));
        System.out.println("Division is "+ (a/b));
        System.out.println("Mod is "+ (a%b));
    }
}
