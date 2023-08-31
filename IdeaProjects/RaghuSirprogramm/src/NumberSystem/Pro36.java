package NumberSystem;

import java.util.Scanner;

public class Pro36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt(); //293
        int sqr=0;
        do {
            int d=n%10;
             sqr=sqr+d;
             n/=10;
        }while (n!=0);
        System.out.print("sum of Digits is: "+sqr);
    }
}
