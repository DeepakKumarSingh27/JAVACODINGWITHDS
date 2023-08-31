package TwoDArray;
public class Arr9 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        System.out.println("Enter first Array");
        int[][] x=ao.readArray();
        System.out.println("Enter second Array");
        int[][] y=ao.readArray();
        System.out.println("user entered first array element is");
        ao.dispmat(x);
        System.out.println("user entered second array element is");
        ao.dispmat(y);
        int[][] add=AddTwoMat(x,y);
        if(add==null)
        {
            System.out.println("Addition is failed");
        }
        System.out.println("Added Matrix is ");
        ao.dispmat(add);
    }
    static int[][] AddTwoMat(int[][] x, int[][] y)
    {
        int[][] rs=new int[x.length][x[0].length];
        for (int i=0;i<rs.length;i++)
        {
            for (int j=0;j<rs[i].length;j++)
            {
                rs[i][j]=x[i][j]+y[i][j];
            }
        }
        return rs;
    }
}
