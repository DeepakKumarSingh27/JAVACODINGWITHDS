package kunalsirAssignment3;
import java.util.Scanner;
public class Pro22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int sum=0,temp=n;
        for (int i=1;i<=n/2;i++)
        {
            if (n%i==0)
            {
                sum+=i;
            }
        }
        if (sum==temp)
        {
            System.out.println(n+" is perfect Number");
        }
        else
        {
            System.out.println(n+" is not perfect Number");
        }
    }
}
