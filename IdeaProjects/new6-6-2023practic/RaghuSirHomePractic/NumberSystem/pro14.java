package RaghuSirHomePractic.NumberSystem;

import java.util.Scanner;

public class pro14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();
        if (age>18){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }
    }
}
