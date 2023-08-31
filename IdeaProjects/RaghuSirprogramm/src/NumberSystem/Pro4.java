package NumberSystem;

import java.util.Scanner;

public class Pro4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle");
        int p=sc.nextInt();
        System.out.println("Enter the Time:");
        int t=sc.nextInt();
        System.out.println("Enter the Rate of Interest");
        int r=sc.nextInt();
        int si=p*t*r/100;
        System.out.println("simple Interest is: "+si);
    }
}
