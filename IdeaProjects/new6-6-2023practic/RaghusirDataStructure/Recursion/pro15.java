package RaghusirDataStructure.Recursion;
import java.util.Arrays;
import java.util.Scanner;
public class pro15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] x = reverse(arr);
        System.out.println(Arrays.toString(x));
    }
    public static int[] reverse(int[] arr) {
        return reverse(arr,0,arr.length-1);
    }
    public static int[] reverse(int[] arr,int start,int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(arr, start + 1, end - 1);
        }
        return arr;
    }
}
