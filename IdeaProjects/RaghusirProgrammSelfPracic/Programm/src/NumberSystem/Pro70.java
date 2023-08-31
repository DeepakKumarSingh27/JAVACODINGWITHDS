package NumberSystem;
import java.util.Scanner;
public class Pro70 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        String hex=decToHex(n);
        System.out.println("Decimal to Hexial is "+hex);
    }
    static String  decToHex(int dec)
    {
      String hex=" ";
      do {
          int d=dec%16;
          if (d<10)
          {
            hex=d+hex;
          }
          else
          {
              hex=((char)(d+55)+hex);
          }
          dec=dec/16;
      }while (dec!=0);
      return hex;
    }
}
