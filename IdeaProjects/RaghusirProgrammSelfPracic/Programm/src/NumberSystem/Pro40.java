package NumberSystem;

import java.util.Scanner;

public class Pro40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;
        do {
            int d=n%10;
            sum=sum+d*d;
            n=n/10;
        }while (n!=0);
        System.out.println("sum od square of digits are "+sum);
    }
}
