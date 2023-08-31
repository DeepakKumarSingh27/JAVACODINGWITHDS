package NumberSystem;

import java.util.Scanner;

public class pro66 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        String dec = decimalToOctal(n);
        System.out.println("Decimal to Binary is "+dec);
    }

    public static String decimalToOctal(int dec) {
        String oct= "";
        do {
            int d = dec %8;
            oct = d + oct;
            dec /= 8;
        }while (dec !=0);
        return oct;
    }
}
