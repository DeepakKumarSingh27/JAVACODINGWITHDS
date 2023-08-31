package NumberSystem;

import java.util.Scanner;

public class Pro21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        if (n>=9 &&n<=99)
            System.out.println(n+" is Number:");
        else if (n>=1 && n<=9)
            System.out.println(n+" is Digit");
        else
            System.out.println("Don't matched Number:");
    }
}
