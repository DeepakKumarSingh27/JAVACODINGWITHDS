package NumberSystem1;
import java.util.Scanner;
public class pro37one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int edig = 0, odig = 0;
        do {
            int d = n % 10;
            if (d % 2 == 0)
                edig++;
            else
                odig++;
            n /= 10;
        }while (n != 0);
        System.out.println("Even Digit is "+edig);
        System.out.println("odd Digit is "+ odig);
    }
}
