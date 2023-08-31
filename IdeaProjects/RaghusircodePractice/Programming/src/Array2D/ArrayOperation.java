package Array2D;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperation {
  public int[][] readArray()
  {
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
      return arr;
  }
  public void dispArray(int[][]matrix)
  {
      for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[0].length; j++) {
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
      }
  }
  public void Dispaly(int[][] matrix)
  {
      for (int[] x:matrix)
      {
          System.out.println(Arrays.toString(x));
      }
  }
}
