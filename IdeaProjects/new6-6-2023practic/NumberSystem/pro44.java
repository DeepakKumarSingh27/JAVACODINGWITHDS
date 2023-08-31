package NumberSystem;

import java.util.Scanner;

public class pro44 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int dg = sumOfDigits(n);
        System.out.println(dg);
    }
    static int sumOfDigits(int n) {
        int sum =0;
        do {
            int d = n% 10;
            sum +=d;
            n /=10;
        }while (n!=0);
        return sum;
    }
}
