package NumberSystem;
import java.util.Scanner;
public class Pro46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int rev=0;
        do {
            int d=n%10;
            rev=(rev*10)+d;
            n=n/10;
        }while (n!=0);
       System.out.println("Reverse number is-> "+rev);
    }
}
