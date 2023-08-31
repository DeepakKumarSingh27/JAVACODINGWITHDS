package NumberSystem1;

import java.util.Scanner;

public class pro7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Amount ");
        int amt = sc.nextInt();
        System.out.println("Rupees of 500 is "+amt/500);
        amt %= 500;
        System.out.println("Rupees of 10 is "+amt/10);
        amt %= 10;
    }
}
