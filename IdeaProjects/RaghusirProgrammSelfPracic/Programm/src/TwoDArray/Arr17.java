package TwoDArray;
import java.util.Arrays;
public class Arr17 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered element is");
        ao.dispmat(x);
        int[] z=diagonalWiseBiggest(x);
        System.out.println("Diagonal wise Sum is");
        System.out.println(Arrays.toString(z));
    }
    static int[] diagonalWiseBiggest(int[][] mat)
    {
        int psum=0,ssum=0;
        for (int i=0;i<mat.length;i++)
        {
            psum=psum+mat[i][i];
            ssum=ssum+mat[i][mat.length-1-i];
        }
        int[] sum={psum,ssum};
        return sum;
    }
}
