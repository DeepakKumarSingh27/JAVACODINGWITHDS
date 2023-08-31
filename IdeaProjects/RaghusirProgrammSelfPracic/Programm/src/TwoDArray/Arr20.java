package TwoDArray;
public class Arr20 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered element");
        ao.dispmat(x);
        int[][] z=rotate90DegreeLeft(x);
        System.out.println("After rotating90 Degree left");
        ao.dispmat(z);
    }
    static int[][] rotate90DegreeLeft(int[][] mat)
    {
        mat=Transpose(mat);
        mat = rowWiseReverse(mat);
        return mat;
    }

    static int[][] Transpose(int[][] mat)
    {
        int[][] tra=new int[mat[0].length][mat.length];
        for (int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[i].length;j++)
            {
                tra[i][j]=mat[j][i];
            }
        }
        //ArrayOperation ao=new ArrayOperation();
        //ao.dispmat(tra);
        return tra;
    }
    static int[][] rowWiseReverse(int[][] mat)
    {
        for (int i=0;i<mat.length;i++)
        {
            int j=0,k=mat.length-1;
            while(j<k)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[i][k];
                mat[i][k]=temp;
                j++;
                k--;
            }
        }
        return mat;
    }
}
