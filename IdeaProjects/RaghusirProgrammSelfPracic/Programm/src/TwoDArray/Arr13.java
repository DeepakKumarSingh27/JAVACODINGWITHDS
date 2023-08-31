package TwoDArray;
import java.util.Arrays;
import java.util.Scanner;
public class Arr13 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered elements");
        ao.dispmat(x);
        int[] z=colwiseBiggest(x);
        System.out.println("column wise biggest is");
        System.out.println(Arrays.toString(z));
    }
    static int[] colwiseBiggest(int[][] mat)
    {
        int[] big=new int[mat[0].length];
        for (int i=0;i<mat.length;i++)
        {
            big[i]=mat[0][i];
            for (int j=1;j<mat[i].length;j++)
            {
                if (mat[j][i]>big[i])
                    big[i]=mat[j][i];
            }
        }
        return big;
    }
}
