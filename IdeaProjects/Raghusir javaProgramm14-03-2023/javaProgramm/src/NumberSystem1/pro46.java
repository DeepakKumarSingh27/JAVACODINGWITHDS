package NumberSystem1;
import java.util.Scanner;
public class pro46 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        System.out.println("product od Digit is "+isProduct(n));
    }

    public static int isProduct(int n) {
        int prod = 1;
        do {
            int d = n % 10;
            prod *=d;
            n /= 10;
        }while (n !=0);
        return prod;
    }
}
