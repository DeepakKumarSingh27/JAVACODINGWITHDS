package OneDArray;
import java.util.Arrays;
import java.util.Scanner;
public class Arr16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter "+n+" values");
        for (int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the index");
        int in=sc.nextInt();
        System.out.println("Enter the element you want to insert ");
        int ele=sc.nextInt();
        int[] z=insertElement(ar,in,ele);
        System.out.println(Arrays.toString(z));
        //System.out.println(Integer.MIN_VALUE);
    }
    static int[] insertElement(int[] ar, int in, int ele)
    {
        if (in<=0&&in<ar.length)
        {
            System.out.println("Index not in Range");
            return ar;
        }
        int[] br=new int[ar.length+1];
        br[in]=ele;
        for (int i=0;i<ar.length;i++)
        {
            if (i<in)
                br[i]=ar[i];
            else
                br[i+1]=ar[i];
        }
        return br;
    }
}
