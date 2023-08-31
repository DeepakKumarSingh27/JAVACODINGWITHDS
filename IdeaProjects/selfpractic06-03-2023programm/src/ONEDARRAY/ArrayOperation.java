package ONEDARRAY;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperation {
    static int[] readArray()
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
    static void dispArray(int[] ar)
    {
        for (int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    static void Display(int[] ar)
    {
        System.out.println(Arrays.toString(ar));
    }
}
