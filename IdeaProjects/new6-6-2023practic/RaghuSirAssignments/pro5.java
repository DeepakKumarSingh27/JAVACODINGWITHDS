package RaghuSirAssignments;
import java.util.Scanner;
public class pro5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int diff = difference(arr);
        System.out.println("Difference is smallest and Biggest is "+diff);
    }
    public static int difference(int[] arr) {
        int big = isBiggest( arr);
        int small = isSmallest(arr);
        return big-small;
    }

    public static int isSmallest(int[] arr) {
        int small= arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]< small) {
                small= arr[i];
            }
        }
        System.out.println("Smallest element in Array is "+small);
        return small;
    }
    public static int isBiggest(int[] arr) {
        int big = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]> big) {
                big= arr[i];
            }
        }
        System.out.println("Biggest element in Array is "+big);
        return big;
    }
}
