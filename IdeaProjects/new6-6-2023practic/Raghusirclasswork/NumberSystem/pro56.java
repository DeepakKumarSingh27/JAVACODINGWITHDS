package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class pro56 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            boolean rs = isPrime(i);
            if (rs)
                System.out.print(i+" ");

        }
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i <= x/2; i++) {
            if (x%i==0)
                return false;
        }
        return true;
    }
}
