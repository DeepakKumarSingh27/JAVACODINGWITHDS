package KunalsirAssignment.FlowControl;

import java.util.Scanner;
public class sumofNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String input;
        while (true)
        {
            System.out.print("Enter a number (or 'x' to exit): ");
            input = scanner.next();
            if (input.equals("x")) {
                break;
            }
            sum += Integer.parseInt(input);
        }
        System.out.println("Sum of all numbers entered: " + sum);
        scanner.close();
    }
}
