package NumberSystem;
import java.util.Scanner;
public class Pro61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            boolean rs=isPerfect(i);
            if (rs==true)
                System.out.print(i+" ");
        }
    }
    static boolean isPerfect(int n)
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
