package ONEDARRAY;
public class Arr9 {
    public static void main(String[] args) {
        System.out.println("Enter first Array");
        int[] x=ArrayOperation.readArray();
        System.out.println("Enter second Array");
        int[] y=ArrayOperation.readArray();
        int[] z=margeArray(x,y);
        System.out.println("After margin is");
        ArrayOperation.dispArray(z);
    }
    static int[] margeArray(int[] x, int[] y)
    {
        int[] z=new int[x.length+y.length];
        for (int i=0;i<x.length;i++)
        {
            z[i]=x[i];
        }
        for (int i=0;i<y.length;i++)
        {
            z[x.length+i]=y[i];
        }
        return z;
    }
}
