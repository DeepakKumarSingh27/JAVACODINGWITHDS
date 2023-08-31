package ArraysOneDimension;
import java.util.Scanner;
public class Arr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Arrays");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
        int sum=getsum(ar);
        System.out.println("sum element is "+sum);
    }
    static int getsum(int[] ar)
    {
        int sum=0;
        for (int i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        return sum;
    }
}
