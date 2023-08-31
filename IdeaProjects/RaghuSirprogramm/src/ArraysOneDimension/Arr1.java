package ArraysOneDimension;
import java.util.Scanner;
public class Arr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n=sc.nextInt();
        double per[]=new double[n];
        System.out.println("Entered "+n+" values");
        for (int i=0;i<per.length;i++)
        {
            per[i]=sc.nextDouble();
        }
        double sum=0;
        for (int i=0;i<per.length;i++)
        {
            sum= sum+per[i];
        }
        System.out.println("avg of array is "+sum/per.length);
    }
}
