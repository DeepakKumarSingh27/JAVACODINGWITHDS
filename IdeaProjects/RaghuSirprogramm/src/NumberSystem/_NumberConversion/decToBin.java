package NumberSystem._NumberConversion;
import java.util.Scanner;
public class decToBin {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        String st=isdecToBin(n);
        System.out.println("Dec to Binary is "+st);
    }
    static String isdecToBin(int dec)
    {
        String bin=" ";
        do {
            int d=dec%2;
            bin=d+bin;
            dec/=2;
        }while (dec!=0);
        return bin;
    }
}
