package TwoDArray;
import java.util.Arrays;
public class Arr14 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered elements");
        ao.dispmat(x);
        int[] z=columnwiseSum(x);
        System.out.println("column wise sum is");
        System.out.println(Arrays.toString(z));
    }
    static int[] columnwiseSum(int[][] mat)
    {
        int[] sum=new int[mat[0].length];
        for (int i=0;i<mat.length;i++)
        {
            //sum[i]=mat[0][i];
            for (int j=0;j<mat[i].length;j++)
            {
                sum[i]+=mat[j][i];
            }
        }
        return sum;
    }
}
