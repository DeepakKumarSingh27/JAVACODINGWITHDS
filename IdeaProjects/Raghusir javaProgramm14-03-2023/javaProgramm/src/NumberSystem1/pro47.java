package NumberSystem1;
import java.util.Scanner;
public class pro47 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        System.out.println("Sum of Digit is "+isSum(n));
    }

    public static int isSum(int n) {
        int sum = 0;
        do {
            int d = n % 10;
            sum +=d;
            n /= 10;
        }while (n !=0);
        return sum;
    }
}
