package NumberSystem;

import java.util.Scanner;

public class pro40 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        int edigt = 0, odigit = 0;
        do {
            int d = n % 10;
            if (d % 2==0)
                edigt +=d;
            else
                odigit +=d;
            n /= 10;
        }while (n !=0);
        System.out.println("sum of even Digit " +edigt+" "+ odigit);
    }
}
