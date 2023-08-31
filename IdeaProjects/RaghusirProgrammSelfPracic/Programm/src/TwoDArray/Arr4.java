package TwoDArray;
public class Arr4 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered element is");
        ao.dispmat(x);
        int sum=sumofArrayElement(x);
        System.out.println("sum of Array element is "+sum);
    }
    static int sumofArrayElement(int[][] mat)
    {
        int sum=0;
        for (int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[i].length;j++)
            {
                sum=sum+mat[i][j];
            }
        }
        return sum;
    }
}
