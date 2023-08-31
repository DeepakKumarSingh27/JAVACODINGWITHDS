package NumberSystem1;

import java.util.Scanner;

public class pro40 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ehe Number ");
        int n =sc.nextInt();
        int esum = 0,osum = 0;
        do {
            int d = n % 10;
            if (d % 2 ==0) esum += d;
            else osum += d;
            n /= 10;
        }while (n!=0);
        System.out.println("sum of even Digests is "+esum);
        System.out.println("sum of odd digits is "+osum);
    }
}
