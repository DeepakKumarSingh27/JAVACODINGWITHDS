package NumberSystem1;

import java.util.Scanner;

public class pro39 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int pro = 1;
        do {
            int d = n % 10;
            pro *= d;
            n /= 10;
        }while (n != 0);
        System.out.println("Product of digit is "+pro);
    }
}
