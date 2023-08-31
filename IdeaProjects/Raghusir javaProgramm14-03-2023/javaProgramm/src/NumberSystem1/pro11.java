package NumberSystem1;

import java.util.Scanner;

public class pro11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Two Number");
        int n= sc.nextInt();
        int m =sc.nextInt();
        if (n==m) System.out.println("Equal");
        else System.out.println("not equal");
    }
}
