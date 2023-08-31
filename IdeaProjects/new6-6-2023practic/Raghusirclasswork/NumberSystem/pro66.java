package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class pro66 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
    int n = sc.nextInt();
    String oct= decToOctal(n);
        System.out.println(oct);
}

    public static String decToOctal(int dec) {
        String bin=" ";
        do {
            int d=dec%8;
            bin=d+bin;
            dec/=8;
        }while (dec!=0);
        return bin;
    }
}
