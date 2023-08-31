package TwoDArray;
import java.util.Arrays;
public class Arr11 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered element is ");
        ao.dispmat(x);
        int[] sum=rowwisesum(x);
        System.out.println("Row wise sum is ");
        System.out.println(Arrays.toString(sum));
    }
    static int[] rowwisesum(int[][] mat)
    {
        int[]row=new int[mat.length];
        for (int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[i].length;j++)
            {
                row[i]+=mat[i][j];
            }
        }
        return row;
    }
}
