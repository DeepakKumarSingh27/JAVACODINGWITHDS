package RaghusirDataStructure.Recursion;

import java.util.Scanner;

public class pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println(sumOfN(n));
    }

    public static int sumOfN(int n) {
        if (n == 1){
            return n;
        }
        return n + sumOfN(n-1);
    }
}
