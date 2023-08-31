package NumberSystem;
import java.util.Scanner;
public class Pro58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        boolean rs=isArmStrong(n);
        if (rs)
            System.out.println(n+" is Diserium number:");
        else
            System.out.println(n+" is not Diserium number:");
    }
    static boolean isArmStrong(int n)
    {
        int sum=0,temp=n;
        int ct=getCount(n);
        do {
            int d=n%10;
            sum=sum+isPower(d,ct);
            ct--;
            n=n/10;
        }while (n!=0);
        return sum==temp;
    }
    static int isPower(int d, int p)
    {
        int pw=1;
        while(p>0)
        {
            pw*=d;
            p--;
        }
        return pw;
    }
    static int getCount(int n)
    {
        int count=0;
        do {
            count++;
            n/=10;
        }while (n!=0);
        return count;
    }
}
