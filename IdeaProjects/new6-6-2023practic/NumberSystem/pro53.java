package NumberSystem;
import java.util.Scanner;
public class pro53 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean rs = isArmStrong(n);
        if (rs) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }

    static boolean isArmStrong(int n) {
        int sum = 0,temp = n;
        int ct = isCount(n);
        do {
            int d = n %10;
            sum +=isPower(ct,d);
            n /=10;
        }while (n!=0);
        return sum == temp;
    }

    private static int isPower(int p, int n) {
        int pow = 1;
        while (p>0)
        {
            pow *=n;
            p--;
        }
        return pow;

    }

    private static int isCount(int n) {
        int count = 0;
        do {
            count++;
            n /= 10;
        }while (n!=0);
        return count;
    }
}
