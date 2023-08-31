package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class pro44 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        fact(n);
    }

    public static void fact(int n) {
        int fact =1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
