package OneDimensionArray;
import java.util.*;
public class Arr22
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n=sc.nextInt();
        int[] x=new int[n];
        System.out.println("Enter "+n+" values");
        for (int i=0;i<x.length;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.println("Enter the index number");
        int m=sc.nextInt();
        System.out.println("original Array element is ");
        System.out.println(Arrays.toString(x));
        int[] y=DeleteEle(x,m);
        System.out.println("After deleting is ");
        System.out.println(Arrays.toString(y));
    }

    private static int[] DeleteEle(int[] ar,int in)
    {
        if (in < 0 && in >= ar.length)
        {
            System.out.println("Index not in the range");
            return ar;
        }
        int[] a = new int[ar.length - 1];
        for (int i = 0; i < ar.length - 1; i++)
        {
            if (i < in)
            {
                a[i] = ar[i];
            } else
            {
                a[i] = ar[i + 1];
            }
        }
        return a;
    }
}

