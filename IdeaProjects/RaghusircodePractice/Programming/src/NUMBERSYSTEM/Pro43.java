package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        for (int i = n; i > 0; i--) {
            System.out.print(i+" ");
        }
    }
}
