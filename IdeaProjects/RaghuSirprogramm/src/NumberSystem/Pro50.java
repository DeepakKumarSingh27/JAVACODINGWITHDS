package NumberSystem;
import java.util.Scanner;
public class Pro50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int pro=proOfDigit(n);
        System.out.println("pro of digit is "+pro);
    }
    static int proOfDigit(int n)
    {
        int pro=1;
        do {
            int d=n%10;
            pro*=d;
            n/=10;
        }while (n!=0);
        return pro;
    }
}
