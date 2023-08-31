package NumberSystem;

import java.util.Scanner;

public class pro54 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean rs = isDiserium(n);
        if (rs) System.out.println("Diserium");
        else System.out.println("Not Diserium");
    }

    static boolean isDiserium(int n) {
        int sum = 0,temp = n;
        int dc = isCount(n);
        do {
            int d = n %10;
            sum +=isPower(dc,d);
            dc--;
            n /=10;
        }while (n!=0);
        return sum == temp;
    }

    private static int isPower(int p, int n) {
        int pow = 1;
        while (p>0)
        {
            pow *=n;
            p--;
        }
        return pow;

    }

    private static int isCount(int n) {
        int count = 0;
        do {
            count++;
            n /= 10;
        }while (n!=0);
        return count;
    }
}
