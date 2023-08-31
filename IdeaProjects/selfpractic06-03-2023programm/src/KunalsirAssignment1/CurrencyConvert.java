package KunalsirAssignment1;
import java.util.Scanner;
public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        int amt=sc.nextInt();
        amt*=82;
        System.out.println("usd conversion is "+amt+"$");
    }
}
