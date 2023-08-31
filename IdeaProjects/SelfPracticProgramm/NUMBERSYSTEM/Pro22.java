package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if (n%3==0 && n%5==0)
            System.out.println("Sanju weeds Geeta");
        else if (n%3==0)
            System.out.println("Sanju");
        else if (n%5==0)
            System.out.println("Geeta");
        else
            System.out.println("Breakup");
    }
}
