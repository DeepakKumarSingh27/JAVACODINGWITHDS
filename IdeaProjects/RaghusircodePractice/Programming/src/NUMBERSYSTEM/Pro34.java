package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int count =1;
        for (int i = 2; i <= n; i++) {
            if (n%i==0)
                count++;
        }
        if (count==2)
            System.out.println(n+" is prime");
        else
            System.out.println(n+" is Not  prime");
    }
}
