package OneDimensionArray;
import java.util.Arrays;
import java.util.Scanner;
public class Arr23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] x=new int[n];
        System.out.println("Enter "+n+" values");
        for (int i=0;i<x.length;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.println("original array element is ");
        System.out.println(Arrays.toString(x));
        reverseArray(x);
        System.out.println("After Reversing Array is");
        System.out.println(Arrays.toString(x));
    }
    static void reverseArray(int[] x)
    {
       int i=0,l=x.length-1;
       while (i<l)
       {
           int temp=x[i];
           x[i]=x[l];
           x[l]=temp;
           i++;
           l--;
       }
    }
}
