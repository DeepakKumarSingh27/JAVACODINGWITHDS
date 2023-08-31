package NumberSystem;
import java.util.Scanner;
public class Pro65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int count=0;
        for (int i = 100; i <= 999; i++) {
            boolean rs = isPalindrome(i);
            if (rs == true) {
                count++;
                System.out.println(i + " is palindrome number");
            }
        }
        System.out.println("total palindrome number is "+count);
    }
    static boolean isPalindrome(int x)
    {
        int rev=0,temp=x;
        do {
            int d=x%10;
            rev=(rev*10)+d;
            x=x/10;
        }while (x!=0);
        return rev==temp;
    }
}
