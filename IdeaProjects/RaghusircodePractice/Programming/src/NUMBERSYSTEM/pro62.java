package NUMBERSYSTEM;
import java.util.Scanner;
public class pro62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            boolean rs = isArmstrong(i);
            if (rs == true)
                count++;
        }
        System.out.println(count);
    }

    static boolean isArmstrong(int n) {
        int sum = 0, temp = n;
        int dc = count(n);
        do {
            int d = n % 10;
            sum = sum + isPower(d, dc);
            n /= 10;
        } while (n != 0);
        return sum == temp;
    }

    static int isPower(int n, int p) {
        int pro = 1;
        while (p > 0) {
            pro *= n;
            p--;
        }
        return pro;
    }

    static int count(int n) {
        int count = 0;
        do {
            count++;
            n /= 10;
        } while (n != 0);
        return count;
    }
}
/*
153->3^3+5^3+1^3=153
 */