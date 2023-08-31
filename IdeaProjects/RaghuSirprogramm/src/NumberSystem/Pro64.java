package NumberSystem;
import java.util.Scanner;
public class Pro64 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        perfectNNum(n);
    }
    static void perfectNNum(int n)
    {
        for (int i=1;n>=0;i++)
        {
            boolean rs=isPerfect(i);
            if (rs==true)
            {
                System.out.print(i+" ");
                n--;
            }
        }
    }
    static boolean isPerfect(int n)
    {
        int sum=0,temp=n;
        for (int i=1;i<=n/2;i++)
        {
            if (n%i==0)
                sum+=i;
        }
        return sum==temp;
    }
}
