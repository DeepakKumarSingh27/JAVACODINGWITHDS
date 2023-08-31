package OneDimensionArray;
import java.util.Arrays;
import java.util.Scanner;
public class Arr12 {
    public static void main(String[] args) {
       ArrayOperation ao=new ArrayOperation();
        System.out.println("Enter first Array");
       int[]x=ao.readArray();
        System.out.println("Enter second Array");
        int[]y=ao.readArray();
        System.out.println("user entered first array is");
        System.out.println(Arrays.toString(x));
        System.out.println("user entered second array is ");
        System.out.println(Arrays.toString(y));
        int[]marge=ZigZagMarge(x,y);
        System.out.println("Result is ");
        System.out.println(Arrays.toString(marge));
    }
    static int[] ZigZagMarge(int[] a, int[] b)
    {
        int[]c=new int[a.length+b.length];
        int i=0,j=0;
        while (i<a.length && i<b.length)
        {
            c[j]=a[i];
            j++;
            c[j]=b[i];
            i++;
            j++;
        }
        while (i<a.length)
        {
            c[j]=a[i];
            j++;
            i++;
        }
        while (i<b.length)
        {
            c[j]=b[i];
            j++;
            i++;
        }
        return c;
    }
}
