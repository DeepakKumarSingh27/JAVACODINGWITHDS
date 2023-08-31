package OneDimensionArray;
import java.util.Arrays;
import java.util.Scanner;
public class Arr16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Entered "+n+" values ");
        for (int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the index you want of Delete in array");
        int in=sc.nextInt();
        int[] z=isInsert(ar,in);
        System.out.println(Arrays.toString(z));
    }
    static int[] isInsert(int[] ar, int in)
    {
        if (in<0||in>ar.length)
        {
            System.out.println("Index not in the range");
            return ar;
        }
        int[] br=new int[ar.length-1];
        for (int i=0;i<ar.length-1;i++)
        {
            if (i<in)
            {
                br[i]=ar[i];
            }
            else
            {
                br[i]=ar[i+1];
            }
        }
        return br;
    }
}
