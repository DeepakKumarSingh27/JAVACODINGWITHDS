package NumberSystem;
import java.util.Scanner;
public class Pro29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int esum=0;
        int osum=0;
        for (int i=1;i<=n;i++)
        {
            if (i % 2==0)
            {
                esum=esum+i;
            }
            else
            {
                osum=osum+i;
            }
        }
        System.out.println("sum of even number is "+esum);
        System.out.println("sum of odd number is: "+osum);
    }
}
