package ArraysOneDimension;
import java.util.Scanner;
public class Arr6 {
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
        int rev=getReverse(ar);
        System.out.println("Reverse of array is "+rev+" ");
    }
    static int getReverse(int[] ar)
    {
        int rev=0;
        for (int i=ar.length-1;i>=0;i--)
        {
          rev=rev*10+ar[i];
        }
     return  rev;
    }
}
