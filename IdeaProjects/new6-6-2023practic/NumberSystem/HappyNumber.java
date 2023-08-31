package NumberSystem;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        boolean rs = isHappy(n);
        if (rs) System.out.println("Happy Number");
        else System.out.println("unHappy number");
    }

    private static boolean isHappy(int n) {
        while (n > 9)
        {
            n = sumOfDigits(n);
        }
        return n==1 || n==7;
    }

    private static int sumOfDigits(int n) {
        int sum =0;
        do {
            int d=n%10;
            sum +=d*d;
            n/=10;
        }while (n!=0);
        return sum;
    }
}
