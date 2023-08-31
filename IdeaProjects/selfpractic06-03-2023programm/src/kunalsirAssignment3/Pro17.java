package kunalsirAssignment3;
import java.util.Scanner;
public class Pro17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        boolean rs=isPalindrome(n);
        if (rs==true)
            System.out.println(n+" is palindrome");
        else
            System.out.println(n+" is not palindrome");
    }
    static boolean isPalindrome(int n)
    {
        int pro=0,temp=n;
        do {
            int d=n%10;
            pro=pro*10+d;
            n/=10;
        }while (n!=0);
        return pro==temp;
    }
}
