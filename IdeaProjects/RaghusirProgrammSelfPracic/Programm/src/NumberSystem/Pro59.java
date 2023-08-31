package NumberSystem;
import java.util.Scanner;
public class Pro59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;
        for (int i=2;i<=n;i++)
        {
            boolean rs=isPrime(i);
            if (rs==true)
                sum=sum+i;
        }
        System.out.println("sum of Prime Number is "+sum);
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
