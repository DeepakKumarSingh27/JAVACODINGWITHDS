package ArraysOneDimension;
import java.util.Scanner;
public class Arr8 {
    static int[] readArray() {
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
    static  void dispArray(int[] ar)
    {
        for (int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("enter first array");
        int[]x=readArray();
        System.out.println("Enter second array");
        int[] y=readArray();
        int[]z=isMargeAarray(x,y);
        System.out.println("marged array is ");
        dispArray(z);
    }
    static int[] isMargeAarray(int[] ar, int[] br)
    {
        int cr[]=new int[ar.length+br.length];
        for (int i=0;i<ar.length;i++)
        {
            cr[i]=ar[i];
        }
        for (int i=0;i<br.length;i++)
        {
            cr[i+ar.length]=br[i];
        }
        return cr;
    }
}
