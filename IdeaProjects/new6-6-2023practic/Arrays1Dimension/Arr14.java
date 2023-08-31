package Arrays1Dimension;
public class Arr14 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        System.out.println("Enter first Array size");
        int[] x= ao.ReadArray();
        System.out.println("Enter second Array size");
        int[] y= ao.ReadArray();
        int[] z= margedArray(x,y);
        System.out.println("merged Array is");
        ao.DisplayArray(z);
    }

    public static int[] margedArray(int[] x, int[] y) {
        int[] z = new int[x.length + y.length];
        int i =0,j=0,k=0;
        while (i < x.length && j < y.length) {
            if (x[i]< y[j])
                z[k++]=x[i++];
            else
                z[k++]=y[j++];
        }
        while (i<x.length)
            z[k++] = x[i++];
        while (j<y.length)
            z[k++] = y[j++];
        return z;
    }
}
