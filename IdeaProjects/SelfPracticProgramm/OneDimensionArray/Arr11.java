package OneDimensionArray;
import java.util.Scanner;
public class Arr11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int[]ar=new int[n];
        System.out.println("Enter "+n+" Elements");
        for (int i=0;i<ar.length;i++)
        {
          ar[i]=sc.nextInt();
        }
        int[] sum=evenoddSum(ar);
        System.out.println("Sum of Even Digit is "+sum[0]);
        System.out.println("sum of odd Digit is "+sum[1]);
    }
    static int[] evenoddSum(int[] ar)
    {
        int esum=0,osum=0;
        for (int i=0;i<ar.length;i++)
        {
            if (ar[i]%2==0)
            {
                esum+=ar[i];
            }
            else {
                osum+=ar[i];
            }
        }
        int[] sum={esum,osum};
        return sum;
    }
}
