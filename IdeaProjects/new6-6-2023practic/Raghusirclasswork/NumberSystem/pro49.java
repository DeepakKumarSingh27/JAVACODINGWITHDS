package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class pro49 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int ct= countDiviser(n);
        System.out.println(ct);
    }

    public static int countDiviser(int n) {
        int ct=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0)
                ct++;
        }
        return ct;
    }
}
