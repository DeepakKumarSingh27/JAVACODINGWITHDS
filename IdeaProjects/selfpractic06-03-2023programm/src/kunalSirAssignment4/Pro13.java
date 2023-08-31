package kunalSirAssignment4;
import java.util.Scanner;
public class Pro13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        int a=sc.nextInt();
        System.out.println("Enter second Number");
        int b=sc.nextInt();
        for (int i=a;i<=b;i++)
        {
            boolean rs=isPrime(i);
            if (rs==true)
                System.out.print(i+" ");
        }
    }
    static boolean isPrime(int x) {
        for (int i = 2; i <=x/2; i++) {
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
}
