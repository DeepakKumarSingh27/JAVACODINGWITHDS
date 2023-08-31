package NumberSystem;

import java.util.Scanner;

public class pro51 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        boolean rs = isStrong(n);
        if(rs) System.out.println("Strong Number");
        else System.out.println(("not Strong number"));
    }

    private static boolean isStrong(int n) {
        int sum =0,temp = n;
        do {
            int d = n%10;
            sum += isFact(d);
            n /= 10;
        }while (n!=0);
        return sum == temp;
    }

    private static int isFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *=i;
        }
        return fact;
    }
}

