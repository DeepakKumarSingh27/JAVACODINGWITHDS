package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n =sc.nextInt();
        if (n<9)
            System.out.println("Digit");
        else
            System.out.println("Number");
    }
}
