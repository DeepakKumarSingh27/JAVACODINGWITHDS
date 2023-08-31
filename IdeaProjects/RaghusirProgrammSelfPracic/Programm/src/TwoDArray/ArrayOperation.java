package TwoDArray;
import java.util.Scanner;
public class ArrayOperation {
    int[][] readArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row");
        int row=sc.nextInt();
        System.out.println("Enter the column");
        int col=sc.nextInt();
        int[][] mat=new int[row][col];
        System.out.println("Enter "+row*col+" Elements");
        for (int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[i].length;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        return mat;
    }
    void dispmat(int[][] mat)
    {
        for (int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[i].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
