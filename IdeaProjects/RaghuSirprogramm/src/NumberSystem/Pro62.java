package NumberSystem;
import java.util.Scanner;
public class Pro62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int sum=sumofprime(n);
        System.out.println("sum of prime number is ->"+sum);
    }
    static int sumofprime(int n)
    {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
         boolean rs=isprime(i);
         if(rs==true)
             sum=sum+i;
        }
        return sum;
    }
    static boolean isprime(int i)
    {
        for (int j=2;j<=i/2;j++)
        {
            if(i%j==0)
                return false;
        }
        return true;
    }
}
