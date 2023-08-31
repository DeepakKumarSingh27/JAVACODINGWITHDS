package NumberSystem;
import java.util.Scanner;
public class Pro50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int div=isDiviser(n);
        System.out.println("Diviser in Number is "+div);
    }
    static int isDiviser(int n)
    {
        int count=0;
        for (int i=1;i<=n/2;i++)
        {
            if (n%i==0)
                count++;
        }
        return count;
    }
}
