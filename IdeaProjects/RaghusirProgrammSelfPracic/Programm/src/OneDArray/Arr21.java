package OneDArray;
import java.util.Scanner;
public class Arr21 {
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
        System.out.println("Enter the number you want to search");
        int x=sc.nextInt();
        int y=search(ar,x);
        if (y==1)
            System.out.println("Element is present");
        else
            System.out.println("Element is Not present");
    }

    static int search(int[] ar, int x)
    {
        for (int i=0;i<ar.length;i++)
        {
            if (ar[i]==x)
                return 1;
        }
        return -1;
    }
}
