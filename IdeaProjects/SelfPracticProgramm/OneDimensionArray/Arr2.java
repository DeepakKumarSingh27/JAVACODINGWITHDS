package OneDimensionArray;
import java.util.Scanner;
public class Arr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n=sc.nextInt();
        double per[]=new double[n];
        System.out.println("Enter "+n+" Elements");
        for (int i=0;i<per.length;i++)
        {
            per[i]=sc.nextDouble();
        }
        double sum=0;
        for (int i=0;i<per.length;i++)
        {
            sum=sum+per[i];
        }
        System.out.println("avg is "+sum/per.length);
    }
}
