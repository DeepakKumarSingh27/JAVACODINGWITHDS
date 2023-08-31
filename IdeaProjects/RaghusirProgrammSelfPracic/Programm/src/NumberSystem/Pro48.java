package NumberSystem;
import java.util.Scanner;
public class Pro48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=issum(n);
        System.out.println("sum of first "+n+" natural number is "+sum);
    }
    static int issum(int n)
    {
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
}
