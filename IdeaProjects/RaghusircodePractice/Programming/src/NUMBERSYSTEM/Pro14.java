package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        if (n>18)
            System.out.println("eligible");
        else
            System.out.println("not eligible");
    }
}
