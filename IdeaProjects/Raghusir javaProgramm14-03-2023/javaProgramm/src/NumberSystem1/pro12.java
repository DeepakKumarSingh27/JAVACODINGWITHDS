package NumberSystem1;

import java.util.Scanner;

public class pro12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number");
        int n =sc.nextInt();
        int m =sc.nextInt();
        if (n>m) System.out.println("Biggest Number is "+n);
        else System.out.println("Biggest number is "+m);
    }
}
