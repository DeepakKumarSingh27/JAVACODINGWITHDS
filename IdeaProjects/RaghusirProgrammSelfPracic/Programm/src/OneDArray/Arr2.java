package OneDArray;
import java.util.Scanner;
public class Arr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        double[] ar=new double[n];
        double sum=0;
        System.out.println("Enter "+n+" values");
        for (int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextDouble();
        }
        for (int i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        System.out.println("Avarage of Array is "+sum/ar.length);
    }
}
