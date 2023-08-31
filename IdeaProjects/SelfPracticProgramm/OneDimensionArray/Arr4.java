package OneDimensionArray;
import java.util.Scanner;
public class Arr4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Entered "+n+" values");
        for (int i=0;i<ar.length;i++ )
        {
            ar[i]=sc.nextInt();
        }
        int big=isBiggest(ar);
        System.out.println("Biggest Number is "+big);
    }
    static int isBiggest(int[] arr)
    {
        int big=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]>big)
                big=arr[i];
        }
        return big;
    }
}
