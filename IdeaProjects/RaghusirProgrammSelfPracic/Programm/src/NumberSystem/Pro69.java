package NumberSystem;
import java.util.Scanner;
public class Pro69 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        String oct=decToOct(n);
        System.out.println("Decimal To Octal: "+oct);
    }
    static String decToOct(int dec)
    {
        String oct=" ";
        do {
            int d=dec%8;
            oct=d+oct;
            dec=dec/8;
        }while (dec!=0);
        return oct;
    }
}
