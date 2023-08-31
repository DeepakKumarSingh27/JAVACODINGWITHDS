package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Arr7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int[] x=ReverseArray(arr);
        for (int i = 0;  i< x.length; i++) {
            System.out.print(x[i]+" ");
        }
       // System.out.println(Arrays.toString(ReverseArray(arr)));
    }
    public static int[] ReverseArray(int[] arr) {
//        for (int i = arr.length-1; i >=0 ; i--) {
//            System.out.print(arr[i]+" ");
//        }
// 1 2 3 4 5
        int i=0,j=arr.length-1;
        while (i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}
/*
1 2 3 4->
4,3,2,1
 */