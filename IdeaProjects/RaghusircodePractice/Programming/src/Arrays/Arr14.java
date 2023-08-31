package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Arr14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Index");
        int in = sc.nextInt();
        System.out.println("Enter the Element");
        int ele = sc.nextInt();
        int[] z = InsertArray(arr,in,ele);
        System.out.println(Arrays.toString(z));
    }
    static int[] InsertArray(int[] arr, int in, int ele) {
        if (in < 0 && ele > arr.length){
            System.out.println("Index Not in the Range");
            return arr;
        }
        int[] z = new int[arr.length+1];
        z[in] = ele;
        for (int i = 0; i < arr.length; i++) {
            if (i < in){
                z[i] = arr[i];
            }else {
                z[i + 1] = arr[i];
            }
        }
        return z;
    }
}
