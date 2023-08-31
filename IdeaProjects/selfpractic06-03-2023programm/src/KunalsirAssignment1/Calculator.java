package KunalsirAssignment1;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        String operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next();

        if (operator.equals("+")) {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operator.equals("-")) {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operator.equals("*")) {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.println("Error: Division by zero.");
            } else {
                result = num1 / num2;
                System.out.println("Result: " + result);
            }
        } else {
            System.out.println("Error: Invalid operator.");
        }

        scanner.close();
    }
}
