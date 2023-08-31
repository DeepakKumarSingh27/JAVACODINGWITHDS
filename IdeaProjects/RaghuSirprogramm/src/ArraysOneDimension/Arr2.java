package ArraysOneDimension;
import java.util.Scanner;
public class Arr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Arrays");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter "+n+" values");
        for (int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        int big=ar[0];
        for (int i=1;i<ar.length;i++)
        {
            if (ar[i]>big)
                big=ar[i];
        }
        System.out.println("Biggest Arrays element is "+big);
    }
}
