package NumberSystem;

import java.util.Scanner;

public class pro8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Two Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b)
            System.out.println("Biggest is "+a);
        else
            System.out.println("Biggest is "+b);
    }
}
