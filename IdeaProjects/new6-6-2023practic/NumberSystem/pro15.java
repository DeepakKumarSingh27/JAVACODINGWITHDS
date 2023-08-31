package NumberSystem;

import java.util.Scanner;

public class pro15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter four subject marks");
        int p = sc.nextInt();
        int c= sc.nextInt();
        int m = sc.nextInt();
        int b = sc.nextInt();
        if (p<35 || c<35 || m <35|| b <35) System.out.println("fail");
        else System.out.println("pass");

    }
}
