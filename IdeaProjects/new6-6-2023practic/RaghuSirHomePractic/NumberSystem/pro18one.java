package RaghuSirHomePractic.NumberSystem;

import java.util.Scanner;

public class pro18one {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        if (n>=1 && n<=9){
            System.out.println("Digit");
        }else {
            System.out.println("not digit");
        }
    }
}
