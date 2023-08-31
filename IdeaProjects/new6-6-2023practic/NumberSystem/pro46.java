package NumberSystem;

import java.util.Scanner;

public class pro46 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int pr = productOfDigits(n);
        System.out.println(pr);
    }

    private static int productOfDigits(int n) {
        int pro =1;
        do {
            int d = n% 10;
            pro *= d;
            n /=10;
        }while (n!=0);
        return pro;
    }
}
