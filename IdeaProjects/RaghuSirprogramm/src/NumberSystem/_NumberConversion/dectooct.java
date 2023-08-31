package NumberSystem._NumberConversion;
import java.util.Scanner;
public class dectooct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        String oct = decTooct(n);
        System.out.println("Decimal to octol is " + oct);
    }
    static String decTooct(int dec)
    {
       String oct=" ";
       do {
           int d=dec%8;
           oct=d+oct;
           dec/=8;
       }while (dec!=0);
       return oct;
    }
}
