package ArrayTwoDimension;
import java.util.Arrays;
import java.util.Scanner;
public class Arr1 {
    public static void main(String[] args) {
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
        System.out.println("user entered elements are");
        for (int[] x:arr){
            System.out.println(Arrays.toString(x));
        }
   }
}
