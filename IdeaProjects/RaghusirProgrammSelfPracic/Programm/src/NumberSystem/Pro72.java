package NumberSystem;
import java.util.Scanner;
public class Pro72 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int oct=octtodec(n);
        System.out.println("octal to decimal is "+oct);
    }
    static int octtodec(int oct)
    {
       int bin=0,pow=1;
       do {
           int d=oct%10;
           bin=bin+d*pow;
           pow*=8;
           oct/=10;
       }while (oct!=0);
       return bin;
    }
}
