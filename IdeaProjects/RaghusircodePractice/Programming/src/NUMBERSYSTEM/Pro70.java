package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro70 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        String n =sc.next();
        int bin= ishexa(n);
        System.out.println(bin);
    }

     static int ishexa(String n) {
        int dec=0,p=0;
         for (int i =n.length()-1; i >0 ; i--) {
          char ch=n.charAt(i);
          int d=0;
          if (ch>='0' && ch <='9')
              d=ch-48;
          else if (ch>='A' && ch<='Z')
              d=ch-55;
          else if (ch>='a' && ch<='z')
              d= ch-87;
          dec=dec+d*(int) Math.pow(16,p);
          p++;
         }
         return dec;
    }
}
