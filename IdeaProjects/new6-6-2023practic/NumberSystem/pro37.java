package NumberSystem;

import java.lang.annotation.Documented;
import java.util.Scanner;

public class pro37 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        int ecount = 0, ocont = 0;
        do {
            int d = n % 10;
            if (d % 2==0)
                ecount++;
            else
                ocont++;
            n /= 10;
        }while (n !=0);
        System.out.println(ecount+" "+ ocont);
    }
}
