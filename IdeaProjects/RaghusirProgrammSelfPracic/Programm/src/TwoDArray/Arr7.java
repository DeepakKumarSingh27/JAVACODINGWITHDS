package TwoDArray;
public class Arr7 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x= ao.readArray();
        System.out.println("user entered array is ");
        ao.dispmat(x);
        int[][] sum=sumofEle(x);
        System.out.println("sum of Array Element is ");
        ao.dispmat(sum);
    }
    static int[][] sumofEle(int[][] mat)
    {
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                int sum = 0;
                do
                {
                    int d = mat[i][j] % 10;
                    sum = sum + d;
                    mat[i][j] /= 10;
                } while (mat[i][j] != 0);
            }
        }
        return mat;
    }
}
