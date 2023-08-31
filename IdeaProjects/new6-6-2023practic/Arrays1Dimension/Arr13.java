package Arrays1Dimension;
public class Arr13 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        System.out.println("Enter first Array size");
        int[] x = ao.ReadArray();
        System.out.println("Enter second Array size");
        int[] y = ao.ReadArray();
        System.out.println("user entered first array element is ");
        ao.DisplayArray(x);
        System.out.println("user entered second array element is ");
        ao.DisplayArray(y);
        int[] z = zigZagArray(x,y);
        System.out.println("Zig Zag Array is ");
        ao.DisplayArray(z);
    }

    public static int[] zigZagArray(int[] x, int[] y) {
        int[] z = new int[x.length + y.length];
        int i =0,j=0;
        while (i<x.length && i <y.length) {
            z[j]=x[i];
            j++;
            z[j] = y[i];
            i++;
            j++;
        }
        while (i<x.length) {
            z[j]=x[i];
            j++;
            i++;
        }
        while (i<y.length) {
            z[j]=y[i];
            j++;
            i++;
        }
        return z;
    }
}
