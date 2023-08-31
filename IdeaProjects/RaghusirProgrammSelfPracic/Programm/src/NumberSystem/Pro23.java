package NumberSystem;

import java.util.Scanner;

public class Pro23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        if (n%3==0&&n%5==0)
            System.out.println("sanju weeds geeta");
        else if (n%3==0)
            System.out.println("sanju");
        else if (n%5==0)
            System.out.println("geeta");
        else
            System.out.println("Breakup");
    }
}
