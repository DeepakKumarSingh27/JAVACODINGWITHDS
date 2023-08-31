package OneDimensionArray;
import java.util.Arrays;
public class Arr19 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        System.out.println("Enter first Array");
        int[] x=ao.readArray();
        System.out.println("Enter second Array");
        int[] y=ao.readArray();
        int[] z=zigzag(x,y);
        System.out.println("user entered element is ");
        ao.disp(x);
        ao.disp(y);
        System.err.println(Arrays.toString(z));
    }
    static int[] zigzag(int[] a, int[] b)
    {
        int[] c=new int[a.length+b.length];
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
            i++;
            j++;
        }
        while (i<b.length)
        {
            c[j]=b[i];
            i++;
            j++;
        }
        return c;
    }
}
