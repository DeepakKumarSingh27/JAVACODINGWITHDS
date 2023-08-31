package NumberSystem;

import java.util.Scanner;

public class pro61 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = 100; i <= 999; i++) {
            boolean rs = isPalindrome(i);
            if (rs == true)
                System.out.print(i+" ");
        }
    }

    private static boolean isPalindrome(int n) {
        int pwr = 0,temp=n;
        do {
            int d = n%10;
            pwr = pwr*10+d;
            n/=10;
        }while (n!=0);
        return pwr == temp;
    }
}
