package RaghusirDataStructure.Recursion;
import java.util.Scanner;
public class pro9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Index you want to search");
        int in = sc.nextInt();
        int z = search(arr,in);
        if (z == -1){
            System.out.println("Not present");
        } else {
            System.out.println("present");
        }
    }
    public static int search(int[] arr, int in) {
        return search(arr,in,arr.length-1);
    }
    public static int search(int[] arr,int ele,int index) {
        if (index == 0) {
            return -1;
        }
        if (arr[index] == ele) {
            return index;
        }
        return search(arr,ele,index-1);
    }
}
