package NumberSystem;
import java.util.Scanner;
public class Pro61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int pc=primeCount(n);
        System.out.println("number of prime in "+n+" is " +pc);
    }
    static int primeCount(int n)
    {
        int count=0;
        for (int i=1;i<=n;i++)
        {
            boolean rs=isPrime(i);
            if (rs==true)
                count++;
        }
        return count;
    }
    static boolean isPrime(int x)
    {
        for (int i=2;i<=x/2;i++)
        {
            if (x%i==0)
                return false;
        }
        return true;
    }
}
