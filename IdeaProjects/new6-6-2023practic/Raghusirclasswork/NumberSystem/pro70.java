package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class pro70 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        String st = sc.next();
        int bin = hexaToDec(st);
        System.out.println(bin);
    }

    public static int hexaToDec(String st) {
        int dec=0,p=0;
        for (int i = st.length()-1;i >=0 ; i--) {
          char ch=st.charAt(i);
          int d=0;
          if (ch>='0'&&ch<='0')
              d=ch-48;
          else if (ch>='A'&&ch<='Z')
              d=ch-55;
          else if (ch>='a'&&ch<='z')
              d=ch-87;
          dec=dec+d*(int)Math.pow(16,p);
          p++;
        }
        return dec;
    }
}
