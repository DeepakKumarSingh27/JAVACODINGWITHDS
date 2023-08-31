package NumberSystem;

import java.util.Scanner;

import static NumberSystem.pro53.isArmStrong;

public class pro62 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int ct=0;
        for (int i = 1; i <= n; i++) {
            boolean rs = isArmStrong(i);
            if (rs == true)
                ct++;
        }
        System.out.println(ct);
    }
}
