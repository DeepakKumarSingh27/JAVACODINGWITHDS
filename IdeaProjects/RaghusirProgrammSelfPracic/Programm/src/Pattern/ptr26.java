package Pattern;
import java.util.Scanner;
public class ptr26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            int k=i;
            for (int j=1;j<=2*i-1;j++)
            {
                System.out.print(k+" ");
                if (j<i)
                    k--;
                else
                    k++;
            }
            System.out.println();
        }
    }
}
