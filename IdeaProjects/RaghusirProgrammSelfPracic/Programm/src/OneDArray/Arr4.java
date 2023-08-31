package OneDArray;
import java.util.Scanner;
public class Arr4 {
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
        int big=isBiggest(ar);
        System.out.println("Biggest Element is "+big);
    }

    static int isBiggest(int[] ar)
    {
        int big=0;
        for (int i=0;i<ar.length;i++)
        {
            if (ar[i]>big)
                big=ar[i];
        }
        return big;
    }
}
