package DataStructure.Array;

import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter values");
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("elements are");
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
