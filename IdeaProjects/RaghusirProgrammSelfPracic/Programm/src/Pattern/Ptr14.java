package Pattern;
import java.util.Scanner;
public class Ptr14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=n;j>=i;j--)
            {
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
    }
}
