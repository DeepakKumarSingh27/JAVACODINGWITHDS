package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        for (int i = n; i > 0 ; i--) {
            System.out.print(i+" ");
        }
    }
}
