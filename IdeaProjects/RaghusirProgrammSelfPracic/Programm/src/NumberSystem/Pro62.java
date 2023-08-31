package NumberSystem;
import java.util.Scanner;
public class Pro62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        for (int i=100;i<=999;i++)
        {
            boolean rs=isPalindrome(i);
            if (rs==true)
                System.out.println(i+" ");
        }
    }
    static boolean isPalindrome(int n)
    {
        int pro=0,temp=n;
        do {
            int d=n%10;
            pro=pro*10+d;
            n=n/10;
        }while (n!=0);
        return pro==temp;
    }
}
