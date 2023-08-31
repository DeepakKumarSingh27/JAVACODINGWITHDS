package ArraysOneDimension;
import java.util.Arrays;
import java.util.Scanner;
public class Arr11 {
    public static void main(String[] args) {
        ArrayOperation op=new ArrayOperation();
        System.out.println("Enter first Array");
        int[] x=op.readArray();
        System.out.println("Enter second Array");
        int[] y=op.readArray();
        System.out.println("user enterd first array is");
        op.dispArray(x);
        System.out.println("user enterd second array is");
        op.dispArray(y);
        int[] z=zigzag(x,y);
        System.out.println(Arrays.toString(z));

    }
    static int[] zigzag(int[] x, int[] y)
    {
        int[]c=new int[x.length+y.length];
        int i=0,j=0;
       while (i<x.length && i<y.length)
       {
         c[j]=x[i];
         j++;
         c[j]=y[i];
         i++;
         j++;
       }
       while (i<x.length)
       {
           c[j]=x[i];
           j++;
           i++;
       }
       while (i<y.length)
       {
        c[j]=y[i];
        j++;
        i++;
       }
       return c;
    }
}
