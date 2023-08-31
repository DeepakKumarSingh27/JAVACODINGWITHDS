package NumberSystem;
import java.util.Scanner;
public class pro47 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int sum = sumOfNaturalNumber(n);
        System.out.println(sum);
    }

    private static int sumOfNaturalNumber(int n) {
        int sum =0;
        for (int i = 1; i <= n; i++) {
            sum +=i;
        }
        return sum;
    }
}
