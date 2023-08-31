package NumberSystem;

import java.util.Scanner;

public class pro59 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        for (int i = 1; n >0; i++) {
            boolean rs = isPrime(i);
            if (rs==true) {
                System.out.print(i + " ");
                n--;
            }
        }
    }

    private static boolean isPrime(int x) {
        for (int i = 2; i <= x/2; i++) {
            if (x % i ==0)
                return false;
        }
        return true;
    }
}
