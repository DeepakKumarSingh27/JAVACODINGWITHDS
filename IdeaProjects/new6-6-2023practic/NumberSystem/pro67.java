package NumberSystem;

import java.util.Scanner;

public class pro67 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        String st = decimalToHexa(n);
        System.out.println("Decimal to Hexa is "+st);
    }

    private static String decimalToHexa(int n) {
        String hex="";
        do {
            int d =n%16;
            if (d<10)
                hex =d +hex;
            else
                hex = (char)(d+55)+hex;
            n /=16;
        }while (n!=0);
        return hex;
    }
}
