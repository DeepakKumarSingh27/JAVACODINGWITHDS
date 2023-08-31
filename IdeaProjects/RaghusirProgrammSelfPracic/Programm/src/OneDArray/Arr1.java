package OneDArray;
import java.util.Scanner;
public class Arr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter "+n+" values");
        for (int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("user Entered Array is-> ");
        for (int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}
