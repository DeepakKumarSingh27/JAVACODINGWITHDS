package KunalsirAssignment1;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = sc.nextInt();
        System.out.println("Enter second Number");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++)
        {
            boolean rs = isArmstrong(i);
            if (rs == true)
            {
                System.out.println(i+" is Armstrong");
            }
        }
    }
    static boolean isArmstrong(int n)
    {
        int sum = 0;
        int temp = n;
        int numberOfDigits = String.valueOf(n).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numberOfDigits);
            temp /= 10;
        }

        return n== sum;
    }
}
