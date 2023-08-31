package NumberSystem;
import java.util.Scanner;
public class Pro52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        boolean ps=isPerfectNum(n);
        if (ps)
            System.out.println(n+" is perfect number:");
        else
            System.out.println(n+" is not a perfect number:");
    }
    static boolean isPerfectNum(int n)
    {
        int sum=0,temp=n;
        for (int i=1;i<=n/2;i++)
        {
         if (n%i==0)
           sum=sum+i;
        }
        return sum==temp;
    }
}
