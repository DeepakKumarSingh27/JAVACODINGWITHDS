package Array2D;
import java.util.Arrays;
import java.util.Scanner;
public class Arr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc.nextInt();
        System.out.println("Enter the column ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter "+row*col+" values");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
             arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("user entered array is");
        for (int[] x:arr){
            System.out.println(Arrays.toString(x));
        }
    }
}
