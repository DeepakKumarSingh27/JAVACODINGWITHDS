package NumberSystem;
import java.util.Scanner;
public class Pro43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int prod=0,temp=n;
        do {
            int d=n%10;
            prod=(prod*10)+d;
            n/=10;
        }while (n!=0);
        if (prod==temp){
            System.out.println(temp+" is Palindrome");
        }else {
            System.out.println(temp+" is not palindrome");
        }
    }
}
