package RaghusirDataStructure.Recursion;
import java.util.Scanner;
public class pro16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int bg = isBiggest(arr,arr.length);
        System.out.println("Biggest is "+bg);
    }
    public static int isBiggest(int[] arr,int n) {
        if (n == 1){
            return arr[0];
        }
        return Math.max(arr[n-1],isBiggest(arr,n-1));
    }
}