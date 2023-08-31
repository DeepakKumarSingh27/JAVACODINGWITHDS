package NumberSystem;
import java.util.Scanner;
public class Pro60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for (int i=2;n>0;i++)
        {
            boolean rs=isPrime(i);
            if (rs==true)
            {
                System.out.print(i + " ");
                n--;
            }
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
