package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int rev=0,temp=n;
        do {
            int d=n%10;
            rev=(rev*10)+d;
            n=n/10;
        }while (n!=0);
        if (rev==temp)
            System.out.println(temp+" is palindrome number");
        else
            System.out.println(temp+" is not a palindrome number");
    }
}
