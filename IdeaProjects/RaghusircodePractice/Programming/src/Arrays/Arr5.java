package Arrays;
import java.util.Scanner;
public class Arr5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int small = isSmallest(arr);
        System.out.println("smallest element is "+small);
    }
    static int isSmallest(int[] arr) {
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }
}
