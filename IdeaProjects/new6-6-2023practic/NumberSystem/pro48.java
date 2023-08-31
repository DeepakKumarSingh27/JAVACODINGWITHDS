package NumberSystem;

import java.util.Scanner;

public class pro48 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        boolean rs = isPerfect(n);
        if (rs) System.out.println("Perfect");
        else System.out.println("Not Perfect");
    }

    private static boolean isPerfect(int n) {
        int sum = 0,temp =n;
        for (int i = 1; i <= n/2; i++) {
            if (n%i==0)
                sum +=i;
        }
        return sum == temp;
    }
}
