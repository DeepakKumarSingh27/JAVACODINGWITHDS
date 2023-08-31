package OneDimensionArray;
import java.util.Scanner;
public class Arr5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter "+n+" Elements ");
        for (int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        int small=isSmallest(ar);
        System.out.println("Smallest Element is "+small);
    }
    static int isSmallest(int[] ar)
    {
        int small=ar[0];
        for (int i=1;i<ar.length;i++)
        {
            if (ar[i]<small);
        }
        return small;
    }
}
