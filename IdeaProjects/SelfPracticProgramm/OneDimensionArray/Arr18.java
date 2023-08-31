package OneDimensionArray;
import java.util.Arrays;
public class Arr18 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        System.out.println("Enter first Array");
        int[] x=ao.readArray();
        System.out.println("Enter the second Array");
        int[]y=ao.readArray();
        int[]z=margeArray(x,y);
        System.out.println("merged Array is "+ Arrays.toString(z));
    }
    static int[] margeArray(int[] a, int[] b)
    {
        int[] c=new int[a.length+b.length];
        for (int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        for (int i=0;i<b.length;i++)
        {
          c[a.length+i]=b[i];
        }
        return c;
    }
}
