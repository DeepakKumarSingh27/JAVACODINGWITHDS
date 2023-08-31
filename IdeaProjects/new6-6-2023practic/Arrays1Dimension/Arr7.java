package Arrays1Dimension;
import java.util.Arrays;
import java.util.Scanner;
public class Arr7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int[] x = isReverse(ar);
        System.out.println(Arrays.toString(x));
    }

    public static int[] isReverse(int[] ar) {
        int first = 0, last = ar.length-1;
        while (first < last){
            int temp = ar[first];
            ar[first]= ar[last];
            ar[last]= temp;
            first++;
            last--;
        }
        return ar;
    }
}
