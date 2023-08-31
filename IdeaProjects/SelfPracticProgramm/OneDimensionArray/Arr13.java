package OneDimensionArray;
import java.util.Scanner;
public class Arr13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        int []ar=new int[n];
        System.out.println("Entered "+n+" values");
        for (int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        int avg=isAvg(ar);
        System.out.println("Array avg is "+avg);
    }

     static int isAvg(int[] ar)
     {
         double sum=0;
         for (int i=0;i<ar.length;i++)
         {
             sum=sum+ar[i];
         }
         double avg=sum/ar.length;
         return (int) avg;
     }
}
