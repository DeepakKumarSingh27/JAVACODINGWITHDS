package TwoDArray;
public class Arr6 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered element is ");
        ao.dispmat(x);
        int small=isSmallest(x);
        System.out.println("Smallest element in Array is "+small);
    }

    static int isSmallest(int[][] mat)
    {
        int small=mat[0][0];
        for(int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[i].length;j++)
            {
                if (mat[i][j]<small)
                    small=mat[i][j];
            }
        }
        return small;
    }
}
