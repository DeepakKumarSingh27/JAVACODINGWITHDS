package Arrays1Dimension;
import java.util.Scanner;
public class Arr6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int sum = isSum(ar);
        System.out.println(sum);
    }

    public static int isSum(int[] ar) {
        int sum =0;
        for (int i = 0; i < ar.length; i++) {
            sum+=ar[i];
        }
        return sum;
    }
}
