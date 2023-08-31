package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int count =0;
        for (int i = 1; i <= n; i++) {
            boolean rs = isprime(i);
            if (rs == true)
                count++;
       }
        System.out.println(count);
    }

    static boolean isprime(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
