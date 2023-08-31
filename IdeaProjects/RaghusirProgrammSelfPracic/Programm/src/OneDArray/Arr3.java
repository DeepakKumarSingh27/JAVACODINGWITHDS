package OneDArray;
import java.util.Scanner;
public class Arr3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array-> ");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter "+n+" values");
        for (int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("uset enter element is ");
        for (int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        int big=0;
        for (int i=0;i<ar.length;i++)
        {
            if (ar[i]>big)
                big=ar[i];
        }
        System.out.println("Biggest element is "+big);
    }
}
