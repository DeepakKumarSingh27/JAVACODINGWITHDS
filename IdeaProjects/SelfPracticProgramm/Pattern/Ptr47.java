package Pattern;
import java.util.Scanner;
public class Ptr47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            int k=1;
            for (int j=1;j<=2*i-1;j++)
            {
                System.out.print(k%2+" ");
                if (j<i)
                    k++;
                else
                    k--;
            }
            System.out.println();
        }
    }
}