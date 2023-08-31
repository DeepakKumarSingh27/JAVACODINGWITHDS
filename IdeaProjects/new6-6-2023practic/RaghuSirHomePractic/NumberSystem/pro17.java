package RaghuSirHomePractic.NumberSystem;

import java.util.Scanner;

public class pro17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Month Number");
        int m = sc.nextInt();
        if (m>=1 && m<=12){
            System.out.println("valid");
        }else {
            System.out.println("not valid");
        }
    }
}
