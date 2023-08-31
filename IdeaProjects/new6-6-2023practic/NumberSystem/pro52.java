package NumberSystem;

import java.util.Scanner;

public class pro52 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("Enter the power");
        int p = sc.nextInt();
        int pow = isPower(n,p);
        System.out.println(pow);
    }

    private static int isPower(int n, int p) {
        int pow = 1;
        while (p>0)
        {
            pow *=n;
            p--;
        }
        return pow;
    }
}
