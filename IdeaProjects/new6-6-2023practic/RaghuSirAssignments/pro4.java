package RaghuSirAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class pro4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] x= reverseArray(arr);
        System.out.println(Arrays.toString(x));
    }

    public static int[] reverseArray(int[] arr) {
        int start = 0,end = arr.length-1;
        while (start < end) {
            int temp= arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
