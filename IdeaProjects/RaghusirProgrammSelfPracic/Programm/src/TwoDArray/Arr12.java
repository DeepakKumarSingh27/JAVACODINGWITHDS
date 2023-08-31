package TwoDArray;
import java.util.Arrays;
public class Arr12 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered element is");
        ao.dispmat(x);
        int[] big=rowWiseBiggest(x);
        System.out.println("Row wiseBiggest is ");
        System.out.println(Arrays.toString(big));
    }
    static int[] rowWiseBiggest(int[][] mat)
    {
        int[] big=new int[mat.length];
        for (int i=0;i<mat.length;i++)
        {
            big[i]=mat[i][0];
            for (int j=0;j<mat[0].length;j++)
            {
                if (mat[i][j]>big[i])
                {
                    big[i]=mat[i][j];
                }
            }
        }
        return big;
    }
}
