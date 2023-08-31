package OneDimensionArray;
import java.util.Scanner;
public class Arr30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter "+n+" values");
        for (int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        printFrequency(ar);
    }
    static void printFrequency(int[] ar)
    {
        int big=ar[0];
       for (int i=1;i<ar.length;i++)
       {
           if (ar[i]>big)
               big=ar[i];
       }
       int []count=new int[big+1];
       for (int i=0;i<ar.length;i++)
       {
           count[ar[i]]++;
       }
       for (int i=0;i<count.length;i++)
       {
           if (count[i]!=0)
           System.out.println(i+" ------> "+count[i]);
       }
    }
}
