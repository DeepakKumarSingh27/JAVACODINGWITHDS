package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i%3==0)
                System.out.print(i+" ");
        }
    }
}
