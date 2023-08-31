package ArrayTwoDimension;
import java.util.Scanner;
public class ArrayOperation {
    int[][] ReadArray() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Row");
        int row = sc.nextInt();
        System.out.println("Enter the Column");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter "+row*col+" values");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public void DisplayArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
