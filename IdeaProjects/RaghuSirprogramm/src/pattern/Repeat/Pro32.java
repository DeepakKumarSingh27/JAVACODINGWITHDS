package pattern.Repeat;
import java.util.Scanner;
public class Pro32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        1  2  3  4  5
           2  3  4  5
              3  4  5
                 4  5
                    5
         */
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i-1;j++)
            {
                System.out.print("  ");
            }
            for (int j=i;j<=n;j++)
            {
                System.out.print(j+"  ");
            }
            System.out.println();
        }
    }
}
