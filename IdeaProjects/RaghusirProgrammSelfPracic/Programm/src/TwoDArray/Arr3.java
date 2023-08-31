package TwoDArray;
public class Arr3 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] row=ao.readArray();
        System.out.println("user entered element is");
        ao.dispmat(row);
        int big=isBiggest(row);
        System.out.println("Biggest Element is "+big);
    }
    static int isBiggest(int[][] mat)
    {
        int big=mat[0][0];
        for (int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[i].length;j++)
            {
                if (mat[i][j]>big)
                    big=mat[i][j];
            }
        }
        return big;
    }
}
