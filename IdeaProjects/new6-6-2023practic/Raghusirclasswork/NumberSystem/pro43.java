package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class pro43 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int rev =0,t=n;
        do {
            int r = n % 10;
            rev = rev*10+r;
            n /= 10;
        }while (n!=0);
        if (rev ==t)
            System.out.println("palindrome");
        else System.out.println("Not palindrome");
    }
}
