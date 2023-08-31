package ArraysOneDimension;
import java.util.Arrays;
import java.util.Scanner;
public class Arr14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("enter "+n+" values ");
        for (int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        // int d=2;
        int[] z=deleteeleinspIn(ar,2);
        System.out.println(Arrays.toString(z));
    }
    static int[] deleteeleinspIn(int[] ar, int in)
    {
        if (in<0||in>ar.length)
        {
            System.out.println("index not in range");
            return ar;
        }
        int[] br=new int[ar.length-1];
      //  br[in]=ele;
        for (int i=0;i<ar.length-1;i++)
        {
            if (i<in)
                br[i]=ar[i];
            else
                br[i]=ar[i+1];
        }
        return br;
    }

}
