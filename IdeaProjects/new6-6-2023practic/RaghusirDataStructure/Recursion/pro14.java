package RaghusirDataStructure.Recursion;
import java.util.Scanner;
public class pro14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum  = isSum(arr);
        System.out.println(sum);
    }
    public static int isSum(int[] arr) {
       return isSum(arr,arr.length);
    }
    public static int isSum(int[] arr, int in) {
        if (in <= 0){
            return 0;
        }
        return (isSum(arr,in-1) + arr[in-1]);
    }
}
