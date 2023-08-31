package Raghusirclasswork.OneDArray;
import java.util.Arrays;
import java.util.Scanner;
public class arr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       int[] x= isReverse(arr);
        System.out.println(Arrays.toString(x));
    }

    public static int[] isReverse(int[] arr) {
        int first =0,end=arr.length-1;
        while (first<end){
            int temp=arr[first];
            arr[first]= arr[end];
            arr[end] = temp;
            first++;
            end--;
        }
        return arr;
    }
}