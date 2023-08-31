package ArraysOneDimension;
import java.util.Arrays;
public class Arr12 {
    public static void main(String[] args) {
        ArrayOperation op = new ArrayOperation();
        System.out.println("Enter first Array");
        int[] a =op.readArray();
        System.out.println("Enter second Array");
        int[] b = op.readArray();
        System.out.println("user enterd first array is");
        op.dispArray(a);
        System.out.println("user enterd second array is");
        op.dispArray(b);
        int[] z=mergSort(a, b);
        System.out.println(Arrays.toString(z));
    }
    static int[] mergSort(int[] a, int[] b)
    {
        int[]c=new int[a.length + b.length];
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length)
        {
            if (a[i]<b[j])
            {
                c[k] = a[i];
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
            k++;
            i++;
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
