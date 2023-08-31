package RaghuSirAssignments;
import java.util.Scanner;
public class pro3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = primeSum(arr);
        System.out.println(sum);
    }

    public static int primeSum(int[] arr) {
      int sum =0;
        for (int i = 0; i < arr.length; i++) {
            boolean rs = isPrime(arr[i]);
            if (rs) {
                sum +=arr[i];
            }
        }
        return sum;
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i <= x/2; i++) {
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}
