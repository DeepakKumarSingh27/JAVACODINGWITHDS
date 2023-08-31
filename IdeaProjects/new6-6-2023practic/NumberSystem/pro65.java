package NumberSystem;
import java.util.Scanner;
public class pro65 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        String dec = decimalToBinary(n);
        System.out.println("Decimal to Binary is "+dec);
    }

    public static String decimalToBinary(int dec) {
        String bin= "";
        do {
            int d = dec %2;
            bin = d + bin;
            dec /= 2;
        }while (dec !=0);
        return bin;
    }
}
