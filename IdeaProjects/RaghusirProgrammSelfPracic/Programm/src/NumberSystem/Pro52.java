package NumberSystem;
import java.util.Scanner;
public class Pro52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
         boolean rs=isStrong(n);
         if (rs=true)
        System.out.println(n+" is strong number");
         else
     System.out.println(n+" is not strong number");
    }
    static boolean isStrong(int n)
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
