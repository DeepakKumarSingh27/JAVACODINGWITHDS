package TwoDArray;
public class Arr8 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered element is ");
        ao.dispmat(x);
        int[][] rev=isTranspose(x);
        System.out.println("Transpose of Array Element is ");
        ao.dispmat(rev);
    }
    static int[][] isTranspose(int[][] mat)
    {
        int[][] tra=new int[mat[0].length][mat.length];
        for (int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[i].length;j++)
            {
                tra[j][i]=mat[i][j];
            }
        }
        return tra;
    }
}
/*
1 2 3
4 5 6
7 8 9
transpose->
1 4 7
2 5 8
3 6 9
 */