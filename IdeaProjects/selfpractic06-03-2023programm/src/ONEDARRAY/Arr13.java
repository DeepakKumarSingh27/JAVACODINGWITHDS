package ONEDARRAY;
public class Arr13 {
    public static void main(String[] args) {
        System.out.println("Enter first Array");
        int[] x=ArrayOperation.readArray();
        System.out.println("Enter second Array");
        int[] y=ArrayOperation.readArray();
        System.out.println("user entered element is");
        ArrayOperation.dispArray(x);
        ArrayOperation.dispArray(y);
        int[] z=zigzag(x,y);
        System.out.println("Zigzag Array is");
        ArrayOperation.dispArray(z);
    }
    static int[] zigzag(int[] x, int[] y)
    {
        int[] z=new int[x.length+y.length];
        int i=0,j=0;
        while (i<x.length&&i<y.length)
        {
            z[j]=x[i];
            j++;
            z[j]=y[i];
            i++;
            j++;
        }
        while (i<x.length)
        {
            z[j]=x[i];
            i++;
            j++;
        }
        while (i<y.length)
        {
            z[j]=y[i];
            i++;
            j++;
        }
        return z;
    }
}
