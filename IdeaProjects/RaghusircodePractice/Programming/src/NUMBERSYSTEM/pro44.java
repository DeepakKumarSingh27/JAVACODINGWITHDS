package NUMBERSYSTEM;
import java.util.Scanner;
public class pro44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        int rev=0,temp=n;
        do {
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }while (n!=0);
        if (temp==rev)
            System.out.println(temp+" is palindrome");
        else
            System.out.println(temp+" is not palindrome");
    }
}
