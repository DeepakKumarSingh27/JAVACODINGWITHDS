package OneDimensionArray;
import java.util.Scanner;
public class Arrr26 {
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
        System.out.println("Enter the element you want to search");
        int ele=sc.nextInt();
        int x=searchEle(ar,ele);
        if (x==-1)
        System.out.println("Element is not present in existing Array "+x);
        else
            System.out.println("Element is present in existing Array "+x);
    }
    static int searchEle(int[] ar, int ele)
    {
        for (int i=0;i<ar.length;i++)
        {
            if (ar[i]==ele)
                return ar[i];
        }
        return -1;
    }
}
