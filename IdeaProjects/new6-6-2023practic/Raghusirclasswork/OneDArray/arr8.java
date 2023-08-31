package Raghusirclasswork.OneDArray;
import java.util.Arrays;
import java.util.Scanner;
public class arr8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter first array " + n + " values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the second size of Array");
        int m = sc.nextInt();
        int[] brr = new int[n];
        System.out.println("Enter second array " + m + " values");
        for (int i = 0; i < n; i++) {
            brr[i] = sc.nextInt();
        }
        int[] x= marge(arr,brr);
        System.out.println(Arrays.toString(x));
    }

    public static int[] marge(int[] arr, int[] brr) {
        int[] y = new int[arr.length+brr.length];
        for (int i = 0; i < arr.length; i++) {
            y[i]=arr[i];
        }
        for (int i = 0; i < brr.length; i++) {
            y[i+arr.length] = brr[i];
        }
        return y;
    }
}
