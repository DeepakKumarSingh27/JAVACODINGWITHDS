package Raghusirclasswork.OneDArray;
import java.util.Arrays;
import java.util.Scanner;
public class arr10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] x= sumofEle(arr);
        System.out.println(Arrays.toString(x));
    }

    public static int[] sumofEle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            do {
              int d=arr[i]%10;
              sum+=d;
              arr[i]/=10;
            }while (arr[i]!=0);
             arr[i]=sum;
        }
        return arr;
    }
}