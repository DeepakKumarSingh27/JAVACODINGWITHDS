package NumberSystem;

import java.util.Scanner;

public class pro3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n<0)
            n *= -1;
        System.out.println("positive number is "+n);
    }
}
