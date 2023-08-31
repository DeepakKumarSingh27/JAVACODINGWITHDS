package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro60 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        String  dec=decTOBin(n);
        System.out.println("Decimal to Binary Number is "+dec);
    }
    static String  decTOBin(int n)
    {
        String bin=" ";
        do {
            int d=n%2;
            bin=d+bin;
            n=n/2;
        }while (n!=0);
        return bin;
    }
}
