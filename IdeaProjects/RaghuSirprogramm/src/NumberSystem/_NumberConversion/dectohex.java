package NumberSystem._NumberConversion;
import java.util.Scanner;
public class dectohex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        String st=decToHex(n);
        System.out.println("hexa decimal number of "+n+" is -> "+st);
    }
    static String decToHex(int dec)
    {
        String hex=" ";
        do {
            int d=dec%16;
            if(d<10)
                hex=d+hex;
            else
                hex=((char)(d+55)+hex);
            dec=dec/16;
        }while (dec!=0);
        return hex;
    }
}
