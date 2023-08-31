package TwoArray;

import java.util.Arrays;
import java.util.Scanner;
public class Arr3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row size");
        int row = sc.nextInt();
        System.out.println("Entere the column size");
        int col = sc.nextInt();
        int [][] arr = new int[row][col];
        System.out.println("Enter "+row*col+" values ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] big = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            big[i]= arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
               if (arr[i][j] > big[i])
                   big[i]= arr[i][j];
            }
        }
        System.out.println(Arrays.toString(big));
    }
}
