package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class pro68 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int bin = binToDec(n);
        System.out.println(bin);
    }

    public static int binToDec(int n) {
        int dec=0,p=0;
        do {
            int d=n%10;
            dec=dec+d*(int)Math.pow(2,p);
            p++;
            n/=10;
        }while (n!=0);
        return dec;
    }
}
