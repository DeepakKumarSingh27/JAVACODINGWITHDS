package NumberSystem;

import java.util.Scanner;

public class pro41 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count = 0;
        do {
            int d = n % 10;
            if (d == 0)
                count++;
            n /= 10;
        }while (n !=0);
        System.out.println(count);
    }
}
