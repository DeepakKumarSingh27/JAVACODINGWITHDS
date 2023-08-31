package TwoDArray;
import java.util.Arrays;
public class Arr18 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered element is");
        ao.dispmat(x);
        int[] z=DiagonalWiseProduct(x);
        System.out.println("Diagonal wise Biggest is");
        System.out.println(Arrays.toString(z));
    }
    static int[] DiagonalWiseProduct(int[][] mat)
    {
        int pbig=mat[0][0],sbig=mat[0][mat.length-1];
        for (int i=0;i<mat.length;i++)
        {
            if (mat[i][i]>pbig)
                pbig=mat[i][i];
            if (mat[i][mat.length-1-i]>sbig)
                sbig=mat[i][mat.length-1-i];
        }
        int[] big={pbig,sbig};
        return big;
    }
}
