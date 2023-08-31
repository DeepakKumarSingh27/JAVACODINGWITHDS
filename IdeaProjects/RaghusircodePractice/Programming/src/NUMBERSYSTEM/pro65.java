package NUMBERSYSTEM;
import java.util.Scanner;
public class pro65 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        String dec=Binary(n);
        System.out.println(dec);
    }
    static String Binary(int dec) {
        String bin="";
        do {
            int d=dec%2;
            bin=d+bin;
            dec/=2;
        }while (dec!=0);
        return bin;
    }
}
/*
11001

 */
