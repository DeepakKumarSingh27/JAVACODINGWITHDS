package Pattern;
import java.util.Scanner;
public class ptr9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
