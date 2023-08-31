package ArraysOneDimension;
import java.util.Scanner;
public class Arr7 {
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
        int ct[]=getEvenOdd(ar);
        System.out.println("Even Array element is "+ct[0]);
        System.out.println("odd Array element is "+ct[1]);
    }
    static int[] getEvenOdd(int[] ar) {
        int esum = 0, osum = 0;
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] % 2 == 0)
            {
                esum = esum + ar[i];
            }
            else
            {
                osum += ar[i];
            }
        }
        int count[] = {esum, osum};
        return count;
    }
}
