package NumberSystem;

import java.util.Scanner;

public class Pro16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        if (n>=1&&n<=9)
            System.out.println(n+" is Digit");
        else
            System.out.println(n+" is Number:");
    }
}
