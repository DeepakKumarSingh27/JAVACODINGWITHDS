package NumberSystem;
import java.util.Scanner;
public class Pro57 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for (int i=2;i<=n;i++)
        {
            boolean rs=isPrime(i);
            if (rs==true)
            System.out.print(i+" ");
        }
    }
    static boolean isPrime(int x)
    {
        for (int j=2;j<=x/2;j++)
        {
            if (x%j==0)
                return false;
        }
        return true;
    }
}
