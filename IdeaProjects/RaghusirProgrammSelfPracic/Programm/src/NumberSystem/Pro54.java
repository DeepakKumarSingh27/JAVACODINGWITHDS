package NumberSystem;
import java.util.Scanner;
public class Pro54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        boolean rs=isArmstrong(n);
        if (rs==true)
System.out.println(n+" is Armstrong number");
        else
System.out.println(n+" is Armstrong number");
    }
    static boolean isArmstrong(int n)
    {
      int sum=0,temp=0;
      int dc=isCount(n);
      do {
          int d=n%10;
          sum=sum+isPower(d,dc);
          n=n/10;
      }while (n!=0);
      return sum==temp;
    }
    static int isPower(int n, int p)
    {
        int pow=1;
        while (p>0)
        {
            pow=pow*n;
            p--;
        }
        return pow;
    }

    static int isCount(int n)
    {
        int count=0;
        do {
            n/=10;
            count++;
        }while (n!=0);
        return count;
    }
}
