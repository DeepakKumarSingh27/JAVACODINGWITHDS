package ArraysOneDimension;
import java.util.Scanner;
public class ArrayOperation {
    int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Arrays");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    static void dispArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}
