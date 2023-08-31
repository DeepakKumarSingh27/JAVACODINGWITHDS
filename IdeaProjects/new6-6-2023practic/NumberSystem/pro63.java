package NumberSystem;

import java.util.Scanner;

public class pro63 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int count =0;
        for (int i = 1; i <= n; i++) {
            boolean rs = specialTwoDigit(i);
            if (rs == true)
                count++;
        }
        System.out.println(count);
    }

    public static boolean specialTwoDigit(int n) {
        int sum =0,temp=n;
        do {
            int d1 = n%10;
            int d2 = n/10;
            sum=d1+d2+d1*d2;
        }while (n!=0);
        return sum == temp;
    }
}
