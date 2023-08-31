package Raghusirclasswork.OneDArray;
import java.util.Scanner;
public class arr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ct = count(arr);
        System.out.println("even is "+ct[0]);
        System.out.println("odd is "+ct[1]);
    }

    public static int[] count(int[] arr) {
        int ec=0,oc=0;
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0)
                ec++;
            else
                oc++;
        }
        int[] ct ={ec,oc};
        return ct;
    }
}