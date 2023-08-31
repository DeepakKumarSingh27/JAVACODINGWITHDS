package TwoDArray;

public class Arr21 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered elements");
        ao.dispmat(x);
        int[][] z=rotate90Right(x);
        System.out.println("After rotating");
        ao.dispmat(z);
    }
    static int[][] rotate90Right(int[][] mat)
    {
        mat=Transpose(mat);
        colWiseRevsere(mat);
        return mat;
    }
    static void colWiseRevsere(int[][] mat)
    {
        for (int i=0;i<mat.length;i++)
        {
            int j=0,k=mat.length-1;
            while (j<k)
            {
                int temp=mat[j][i];
                mat[j][i]=mat[k][i];
                mat[k][i]=temp;
            }
        }
    }

    private static int[][] Transpose(int[][] mat)
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
