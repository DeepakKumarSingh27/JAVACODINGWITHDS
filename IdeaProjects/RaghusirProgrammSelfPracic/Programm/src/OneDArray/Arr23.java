package OneDArray;
import java.util.Scanner;
public class Arr23 {
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
        System.out.println("Enter the element");
        int ele=sc.nextInt();
        int x=NtHBiggest(ar,ele);
        System.out.println("NTHBiggest is "+x);
    }
    static int NtHBiggest(int[] x, int n)
    {
        for (int i=0;i<x.length;i++)
        {
            int count=0;
            for (int j=0;j<x.length;j++)
            {
                if (x[j]>x[i])
                    count++;
            }
            if (count==n-1)
                return x[i];
        }
        return -1;

    }
}
