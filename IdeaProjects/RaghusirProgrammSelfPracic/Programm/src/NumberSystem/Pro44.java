package NumberSystem;
import java.util.Scanner;
public class Pro44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
       int pro=0,temp=n;
       do {
           int d=n%10;
           pro=pro*10+d;
           n=n/10;
       }while (n!=0);
       if (pro==temp)
           System.out.println(temp+" is palindrome");
       else
           System.out.println(temp+" is not palindrome");

    }
}
