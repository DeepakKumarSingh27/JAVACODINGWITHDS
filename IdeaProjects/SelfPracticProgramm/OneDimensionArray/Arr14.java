package OneDimensionArray;

import java.util.Arrays;

public class Arr14 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        System.out.println("Enter first Array:");
        int[] x=ao.readArray();
        System.out.println("Enter  second Array:");
        int[] y=ao.readArray();
        int[] z=margeArray(x,y);
       // System.out.println("marge Arrays is "+z);
        System.out.println(Arrays.toString(z));
    }
    static int[] margeArray(int[] a, int[] b)
    {
        int c[]=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while (i < a.length && j < b.length)
        {
            if (a[i]<b[j])
            {
                c[k]=a[i];
                i++;
            }
            else
            {
                c[k]=b[j];
                j++;
            }
            k++;
        }
        while (i<a.length)
        {
            c[k]=a[i];
            i++;
            k++;
        }
        while (j<b.length)
        {
            c[k]=b[j];
            j++;
            k++;
        }
        return c;
    }
}
