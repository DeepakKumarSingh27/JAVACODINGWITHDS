package NUMBERSYSTEM.PrimeNumber;

import java.util.Scanner;

public class Pro9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int small=n%10;
        /*
        while(0>0)
        n=1234
       d= n%10->1
       d=4,
        n/10->1
        big=4;
        if(4<1)
        big=4;
        12345
         */
        while(n>0)
        {
            int d=n%10;
            if (small>d)
                small=d;
            n=n/10;
        }
        System.out.println("Smallest number is "+small);
    }
}
