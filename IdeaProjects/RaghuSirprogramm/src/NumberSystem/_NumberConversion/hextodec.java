package NumberSystem._NumberConversion;
import java.util.Scanner;
public class hextodec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        String n=sc.next();
        int dec=hexToDec(n);
        System.out.println("hexa to decimal of "+n+" is "+dec);
    }
    static int hexToDec(String hx) //2Abd
    {
        int dec=0,p=0;
        int d=0;
        for (int i=hx.length()-1;i>=0;i--)
        {
          char ch=hx.charAt(i);
          if (ch>='0'&&ch<='9')
              d=ch-48;
          else if(ch>='A'&&ch<='Z')
              d=ch-55;
          else if(ch>='a'&&ch<='z')
              d=ch-87;
          dec=dec+d*(int)Math.pow(16,p);
          p++;
        }
        return dec;
    }
}
