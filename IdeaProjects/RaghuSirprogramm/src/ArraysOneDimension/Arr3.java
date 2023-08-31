package ArraysOneDimension;
import java.util.Arrays;
import java.util.Scanner;
public class Arr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Arrays");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
        int big=getBiggest(ar);
        System.out.println("Biggest element is "+big);
    }
    static int getBiggest(int[] ar)
    {
        int big=ar[0];
        for (int i=1;i<ar.length;i++)
        {
            if (ar[i]>big)
                big=ar[i];
        }
        return big;
    }
}
