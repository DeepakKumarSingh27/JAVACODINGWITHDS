package OneDimensionArray;
import java.util.Scanner;
public class Arr6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Entered "+n+" elements");
        for (int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        int sum=isSum(ar);
        System.out.println("sum of Entered is "+sum);
    }
    static int isSum(int[] ar)
    {
        int sum=0;
        for (int i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        return sum;
    }
}
