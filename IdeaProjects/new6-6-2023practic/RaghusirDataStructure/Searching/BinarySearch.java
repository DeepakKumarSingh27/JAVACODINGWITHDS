package RaghusirDataStructure.Searching;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search");
        int ele = sc.nextInt();
        int bin = isBsearch(arr, ele);
        if (bin == -1) {
            System.out.println("Not present");
        } else {
            System.out.println("present");
        }
    }

    public static int isBsearch(int[] arr, int ele) {
        return isBsearch(arr, ele, 0, arr.length - 1);
    }

    public static int isBsearch(int[] arr, int ele, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low +(high - low)/2;
        if (arr[mid] == ele) {
            return mid;
        }
        if (ele > arr[mid]) {
            return isBsearch(arr, ele, mid - 1, high);
        } else {
            return isBsearch(arr, ele, low, mid - 1);
        }
    }
}
