package TwoArray;

import java.util.Scanner;

public class Arr2 {
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
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if ( arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        System.out.println("maximum element is "+max);
    }
}
