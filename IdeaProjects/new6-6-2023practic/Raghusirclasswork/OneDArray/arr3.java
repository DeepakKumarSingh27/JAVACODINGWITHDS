package Raghusirclasswork.OneDArray;
import java.util.Scanner;
public class arr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int big = isBiggest(arr);
        System.out.println("Biggest Element is "+big);
    }
    public static int isBiggest(int[] arr) {
        int big= arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > big)
                big= arr[i];
        }
        return big;
    }
}