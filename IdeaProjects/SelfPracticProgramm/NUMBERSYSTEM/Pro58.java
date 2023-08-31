package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=isPrimSum(n);
        System.out.println("prime number sum is "+sum);
    }
    static int isPrimSum(int n)
    {
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            boolean rs=isPrime(i);
            if (rs==true)
                sum=sum+i;
        }
        return sum;
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
