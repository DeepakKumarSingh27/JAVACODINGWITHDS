package Raghusirclasswork.OneDArray;

import java.util.Arrays;

public class arr13 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        System.out.println("first Array");
        int[] x= ao.readArray();
        System.out.println("user entered first array element is ");
        ao.show(x);
        System.out.println("second Array");
        int[] y= ao.readArray();
        System.out.println("user entered second array element is ");
        ao.show(y);
        int[] z = marge(x,y);
        System.out.println(Arrays.toString(z));
    }

    public static int[] marge(int[] x, int[] y) {
        int[] z= new int[x.length+y.length];
        int i=0,j=0,k=0;
        while (i<x.length && j<y.length) {
            if (x[i] <y[j]) {
                z[k] = x[i];
                i++;
            } else {
                z[k] = y[j];
                j++;
            }
            k++;
        }
        while (i<x.length) {
            z[k]= x[i];
            i++;
            k++;
        }
        while (j<y.length) {
            z[k] = y[j];
            k++;
            j++;
        }
        return z;
    }
}
