package Raghusirclasswork.OneDArray;
import java.util.Scanner;
public class arr9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ct=primeCount(arr);
        System.out.println(ct);
    }
    public static int primeCount(int[] arr) {
        int ct =0;
        for (int i = 0; i <arr.length ; i++) {
            boolean rs = isPrime(arr[i]);
            if (rs==true) {
                ct++;
            }
        }
        return ct;
    }
    public static boolean isPrime(int x) {
        for (int i = 2; i <= x/2; i++) {
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
}
