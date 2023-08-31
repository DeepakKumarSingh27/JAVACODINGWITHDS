package OneDimensionArray;
import java.util.Scanner;
public class Arr3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Entered "+n+" value ");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int big=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (big<arr[i])
                big=arr[i];
        }
        System.out.println("Biggest Element is "+big);

    }
}
