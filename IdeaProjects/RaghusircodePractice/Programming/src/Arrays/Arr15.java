package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Arr15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Index you want to delete ");
        int in = sc.nextInt();
        int[] z = DeleteArray(arr,in);
        System.out.println(Arrays.toString(z));
    }
    static int[] DeleteArray(int[] arr, int in) {
        if (in < 0 || in > arr.length){
            System.out.println("index not in the range");
            return arr;
        }
        int[] z = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            if (i < in){
                z[i] = arr[i];
            }else {
                z[i] = arr[i + 1];
            }
        }
        return z;
    }
}
