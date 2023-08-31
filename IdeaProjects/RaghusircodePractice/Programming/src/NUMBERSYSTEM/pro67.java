package NUMBERSYSTEM;
import java.util.Scanner;public class pro67 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n =sc.nextInt();
        String st= isHexa(n);
        System.out.println(st);
    }
    static String isHexa(int n) {
        String hx="";
        do {
            int d=n%16;
            if (d <10)
                hx=d+hx;
            else
                hx=(char)(d+87)+hx;
            n/=16;
        }while (n!=0);
        return hx;
    }
}
/*
1 to 9 a to f
 */