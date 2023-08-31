package OneDimensionArray;
import java.util.Scanner;
public class Arr25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Array size");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter "+n+" values");
        for (int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter  second Array size ");
        int m=sc.nextInt();
        int[] arr2=new int[m];
        System.out.println("Enter "+m+" values");
        for (int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("Enter the index");
        int in=sc.nextInt();
        int[] z=insert(arr1,arr2,in);
        System.out.println("Insert Array is ");
        for (int i=0;i<z.length;i++)
        {
            System.out.print(z[i]+" ");
        }
    }
    static int[] insert(int[] arr1, int[] arr2, int in)
    {
        int[]br=new int[arr1.length+arr2.length];
        for (int i=0;i<arr2.length;i++)
        {
            br[i+in]=arr2[i];
        }
        for (int i=0;i<arr1.length;i++)
        {
            if (i<in)
            {
                br[i]=arr1[i];
            }
            else
            {
                br[i+arr2.length]=arr1[i];
            }
        }
        return br;
    }
}
