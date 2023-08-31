package Raghusirclasswork.NumberSystem;

import java.util.Scanner;
public class pro37 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int ecount = 0,ocount=0;
        do {
            int r = n%10;
            if (r%2==0)
                ecount++;
            else
                ocount++;
            n/=10;
        }while (n!=0);
        System.out.println(ecount+" "+ocount);
    }
}
