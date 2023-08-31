package AssignMent7;
import ONEDARRAY.ArrayOperation;

import java.util.Arrays;
import java.util.Scanner;
public class ZigZagArray {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter first Array size");
//        int a = sc.nextInt();
//        int[] arr = new int[a];
//        System.out.println("Enter "+a+" values");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the second");
//        int b = sc.nextInt();
//        int[] brr =new int[b];
//        System.out.println("Enter "+b+" values");
//        for (int i = 0; i < brr.length; i++) {
//            brr[i] = sc.nextInt();
//        }
//          int[] z = zigZag(arr,brr);
      //  System.out.println(Arrays.toString(z));
        ArrayOpernation ao = new ArrayOpernation();
        System.out.println("Enter first Array");
        int[] x = ao.readArray();
        System.out.println("user entered element is ");
        ao.display(x);
        System.out.println("Enter second Array");
        int[] y = ao.readArray();
        System.out.println("user entered element is ");
        ao.display(y);
        System.out.println("zig zag array is ");
        int[] z = zigZag(x,y);
        ao.display(z);
    }
    public static int[] zigZag(int[] arr, int[] brr) {
        int[] z = new int[arr.length + brr.length];
        int i = 0, j = 0;
        while (i < arr.length && i < brr.length) {
            z[j] = arr[i];
            j++;
            z[j] = brr[i];
            i++;
            j++;
        }
        while (i < arr.length) {
            z[j] = arr[i];
            j++;
            i++;
        }
        while (i < brr.length) {
            z[j] = brr[i];
            j++;
            i++;
        }
        return z;
    }
}
