package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;
        do {
            int r=n%10;
            sum=sum+r;
            n/=10;
        }while (n!=0);
        System.out.println("sum of Digit is "+sum);
    }
}
