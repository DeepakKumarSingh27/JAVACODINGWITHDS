package kunalSirAssignment4;
import java.util.Scanner;
public class Pro10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        boolean rs=isPalindrome(n);
        if (rs==true)
            System.out.println(n+" is Palindrome");
        else
            System.out.println(n+" is Not Palindrome");

    }
    static boolean isPalindrome(int n) {
        int sum=0,prod=10,temp=n;
        do {
            int d=n%10;
            sum=sum*prod+d;//112
            n/=10;
        }while (n!=0);
        return sum==temp;
    }
}
