package Raghusirclasswork.OneDArray;
import java.util.Arrays;
import java.util.Scanner;
public class arr12 {
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
        int[] z = zigZag(x,y);
        System.out.println(Arrays.toString(z));
    }

    public static int[] zigZag(int[] a, int[] b) {
        int[] c= new int[a.length+b.length];
        int i=0,j=0;
        while (i<a.length&&i<b.length) {
            c[j]=a[i];
            j++;
            c[j]=b[i];
            i++;
            j++;
        }
        while (i<a.length){
            c[j]=a[i];
            i++;
            j++;
        }
        while (i<b.length) {
            c[j]=b[i];
            i++;
            j++;
        }
        return c;
    }
}
