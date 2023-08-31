package ArraysOneDimension;
import java.util.Scanner;
public class Arr4 {
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
        int small=getSmallest(ar);
        System.out.println("smallest element is "+small);
    }
    static int getSmallest(int[] ar)
    {
        int small=ar[0];
        for (int i=0;i<ar.length;i++)
        {
            if (small>ar[i])
                small=ar[i];
        }
        return small;
    }
}
