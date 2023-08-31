package Arrays;
import java.util.Scanner;
public class Arr8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first size of Array");
        int n= sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter size of second Array");
        int m =sc.nextInt();
        int[] br=new int[m];
        System.out.println("Enter first Array  "+n+" values");
        // System.out.println("merged Array is");
        for (int i = 0; i < ar.length; i++) {
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter second Array  "+m+" values");
        for (int i = 0; i < br.length; i++) {
            br[i]=sc.nextInt();
        }
        int[] x=margeArray(ar,br);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }
    }
    static int[] margeArray(int[] ar, int[] br) {
        int[] z=new int[ar.length+br.length];//8
        for (int i = 0; i < ar.length; i++) {
            z[i]=ar[i];// 1 2 3 4
        }
        for (int i = 0; i < br.length; i++) {
            z[i+ar.length]=br[i];
        }
        return z;
    }
}
