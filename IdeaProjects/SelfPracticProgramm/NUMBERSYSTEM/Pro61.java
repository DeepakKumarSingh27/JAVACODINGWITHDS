package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        String oct=decToOct(n);
        System.out.println("Decimal to octal is "+oct);
    }
    static String decToOct(int n)
    {
        String oct=" ";
        do {
            int d=n%8;
            oct=d+oct;
            n=n/8;
        }while (n!=0);
        return oct;
    }
}
