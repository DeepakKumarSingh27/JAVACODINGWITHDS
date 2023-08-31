package NumberSystem;
import java.util.Scanner;
public class Pro73 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        String n=sc.nextLine();
        int hext=hexToDec(n);
        System.out.println("hexa to decimal is "+hext);
    }
    static int hexToDec(String hex)
    {
        int dec=0,pow=1;
        int d=0;
        for (int i=hex.length()-1;i>=0;i--)
        {
            char ch=hex.charAt(i);
            if (ch>='0'&&ch<='9')
                d=ch-48;
            else if (ch>='A'&&ch<='Z')
                d=ch-55;
            else if (ch>='a'&&ch<='z')
                d=ch-87;
          //  dec=dec+d*(int)Math.pow(16,pow);
            dec=dec+d*pow;
            //pow++;
           pow=pow*16;
        }
        return dec;
    }
}
