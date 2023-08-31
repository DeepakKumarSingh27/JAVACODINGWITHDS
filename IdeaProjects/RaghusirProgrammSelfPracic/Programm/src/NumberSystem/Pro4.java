package NumberSystem;

import java.util.Scanner;

public class Pro4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle");
        int p=sc.nextInt();
        System.out.println("Enter the rate of interest");
        int r=sc.nextInt();
        System.out.println("Enter the time");
        int t=sc.nextInt();
        int si=p*r*t/100;
        System.out.println("simple interest is "+si);
    }
}
