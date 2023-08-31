package RaghuSirHomePractic.NumberSystem;

import java.util.Scanner;

public class pro16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n<9){
            System.out.println("Digit");
        }else {
            System.out.println("Number");
        }
    }
}
