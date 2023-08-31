package NumberSystem;

import java.util.Scanner;

public class Pro7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Amount ");
        int amt=sc.nextInt();
        System.out.println("500 Rupees is: "+amt/500);
        amt%=500;
        System.out.println("50 Rupees is: "+amt/50);
        amt%=50;
    }
}
