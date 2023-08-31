package NumberSystem;

import java.util.Scanner;

public class pro11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b)
            System.out.println("Number are equal");
        else
            System.out.println("Number are not equal");
    }
}
