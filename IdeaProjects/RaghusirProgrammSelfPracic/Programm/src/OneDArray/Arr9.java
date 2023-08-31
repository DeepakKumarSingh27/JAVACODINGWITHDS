package OneDArray;
import java.util.Arrays;
public class Arr9 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        System.out.println("Enter first Array Element.");
        int[] x=ao.readArray();
        System.out.println("Enter Second Array Element.");
        int[] y=ao.readArray();
        System.out.println("user entred first array are");
        ao.dispArray(x);
        System.out.println("user entred second array are");
        ao.dispArray(y);
        int[] z=margeArray(x,y);
        System.out.println("marge Array is ");
        ao.dispArray(z);
        for (int x1:z)
        {
            System.out.print(x1+" ");
        }
        //System.out.println(Arrays.toString(z));
    }
    static int[] margeArray(int[] x, int[] y)
    {
        int[] mz=new int[x.length+y.length];
        for (int i=0;i<x.length;i++)
        {
            mz[i]=x[i];
        }
        for (int i=0;i<y.length;i++)
        {
            mz[x.length+i]=y[i];
        }
        return mz;
    }
}
