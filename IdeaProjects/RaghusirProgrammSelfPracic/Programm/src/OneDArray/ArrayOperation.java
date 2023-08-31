package OneDArray;
import java.util.Scanner;
public class ArrayOperation {
    int[] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter "+n+" values");
        for (int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        return ar;
    }
    public void dispArray(int[] x)
    {
        for (int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
}
