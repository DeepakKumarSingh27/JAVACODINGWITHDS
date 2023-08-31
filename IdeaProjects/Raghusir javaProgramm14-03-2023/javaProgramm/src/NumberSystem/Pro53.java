package NumberSystem;
import java.util.Scanner;
public class Pro53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        boolean rs = isArmstrong(n);
        if (rs == true)
            System.out.println(n+" is Armstrong Number");
        else
            System.out.println(n+" is not armstrong number");
    }
    static boolean isArmstrong(int n) {
        int sum = 0,temp = n;
        int dc=countDigit(n);
        do {
            int d = n % 10;
            sum+=isPower(d,dc);
            n/=10;
        }while (n != 0);
        return sum == temp;
    }
    static int isPower(int n, int p) {
        int pow = 1;
        while (p > 0){
            pow *= n;
            p--;
        }
        return pow;
    }

    static int countDigit(int n) {
        int count = 0;
        do {
            count++;
            n /= 10;
        }while (n != 0);
        return count;
    }
}
