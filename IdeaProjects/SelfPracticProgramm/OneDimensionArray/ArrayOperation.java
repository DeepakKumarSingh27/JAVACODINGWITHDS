package OneDimensionArray;
import java.util.Scanner;
public class ArrayOperation {
    int []readArray()
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] ar=new int[n];
            System.out.println("Entered "+n+" Integer Values");
            for (int i=0;i<ar.length;i++)
            {
                ar[i]=sc.nextInt();
            }
            return ar;
    }
    void disp(int[] ar)
    {
        for (int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    void isReverse(int[] ar)
    {
        int i=0,j=ar.length-1;
        while (i<j)
        {
            int temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            i++;
            j--;
        }
    }
}
