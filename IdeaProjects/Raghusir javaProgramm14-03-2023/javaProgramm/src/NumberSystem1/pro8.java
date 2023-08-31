package NumberSystem1;

import java.util.Scanner;

public class pro8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first Number");
        int n= sc.nextInt();
        System.out.println("Enter second Number");
        int m =sc.nextInt();
        System.out.println("Biggest Number is "+((n>m)?n:m));
    }
}
