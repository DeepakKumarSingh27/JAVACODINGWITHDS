package OneDimensionArray;
import java.util.Scanner;
public class Arr27 {
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
        System.out.println("Enter the Element");
        int in=sc.nextInt();
        int x=countSpIndx(ar,in);
        System.out.println("The element is present "+x+" times");
    }
    static int countSpIndx(int[] ar, int in)
    {
        int count=0;
        for (int i=0;i<ar.length;i++)
        {
            if (ar[i]==in)
                count++;
        }
        return count;
    }
}
