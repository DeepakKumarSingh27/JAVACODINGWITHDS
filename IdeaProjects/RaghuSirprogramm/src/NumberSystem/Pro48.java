package NumberSystem;
import java.util.Scanner;
public class Pro48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int fc=isFact(n);
        System.out.println(n+" factorial is ->"+fc);
    }
    static int isFact(int n)
    {
        int fact=1;
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}
