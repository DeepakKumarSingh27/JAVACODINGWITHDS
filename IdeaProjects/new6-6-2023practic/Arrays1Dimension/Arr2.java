package Arrays1Dimension;

import java.util.Scanner;
public class Arr2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        double[] ar = new double[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum +=ar[i];
        }
        System.out.println("Avg is "+sum/ar.length);
    }
}

