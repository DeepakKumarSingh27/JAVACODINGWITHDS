package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class pro57 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count=0;
        for (int i = 1; i <=n ; i++) {
            boolean rs = isPrime(i);
            if (rs) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("=========");
        System.out.println(count);
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i <= x/2; i++) {
            if (x%i==0)
                return false;
        }
        return true;
    }
}
