package ArraysOneDimension;
import java.util.Arrays;
import java.util.Scanner;
public class Arr10 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("enter " + n + " values ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int x[] =getSum(ar);
        System.out.println(Arrays.toString(x));

    }
    static int[] getSum(int[] ar)
    {
        for (int i=0;i<ar.length;i++)
        {
            int sum=0;
           do {
              int d=ar[i]%10;
              sum=sum+d;
              ar[i]/=10;
           }while (ar[i]!=0);
           ar[i]=sum;
        }
        return ar;
    }
}
