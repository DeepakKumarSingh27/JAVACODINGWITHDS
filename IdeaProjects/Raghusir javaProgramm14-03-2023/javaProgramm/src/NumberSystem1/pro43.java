package NumberSystem1;
import java.util.Scanner;
public class pro43 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int rev = 0,temp = n;
        do {
            int d = n % 10;
            rev =rev*10+d;
            n /= 10;
        }while (n !=0);
        if (rev == temp) System.out.println("palindrome");
        else System.out.println("Not Palindrome");
    }
}
