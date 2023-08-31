package NumberSystem;

import java.util.Scanner;

public class pro60 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            boolean rs = isPerfect(i);
            if (rs == true)
                System.out.print(i+" ");
        }
    }

    private static boolean isPerfect(int n) {
        int sum =0,temp=n;
        for (int i = 1; i <= n/2; i++) {
            if (n % i ==0)
                sum+=i;
        }
        return temp == sum;
    }
}
