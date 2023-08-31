package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int esum=0,osum=0;
        for (int i=1;i<=n;i++)
        {
          if (n%i==0)
              esum=esum+i;
          else
              osum=osum+i;
        }
        System.out.println("sum of even number is "+esum);
        System.out.println("sum of odd number is "+osum);
    }
}
