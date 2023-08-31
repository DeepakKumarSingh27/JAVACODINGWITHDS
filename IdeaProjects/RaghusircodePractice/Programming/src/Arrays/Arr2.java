package Arrays;
import java.util.Scanner;
// read double type array from user and print the avg
public class Arr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        double[] arr=new double[n];
        double sum=0;
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextDouble();
        }
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("Avg of Array is "+sum/arr.length);
    }
}

/*
1 2 3 4
1+2+3+4=10/4=2.5;
 */