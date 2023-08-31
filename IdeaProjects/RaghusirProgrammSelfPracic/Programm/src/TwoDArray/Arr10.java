package TwoDArray;
public class Arr10 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered element is");
        ao.dispmat(x);
        int[] ct=evenoddcount(x);
        System.out.println("Even Number present in Array is "+ct[0]);
        System.out.println("Odd Number present in Array is "+ct[1]);
    }
    static int[] evenoddcount(int[][] mat)
    {
        int ec=0,oc=0;
        for (int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[i].length;j++)
            {
                if (mat[i][j]%2==0)
                    ec++;
                else
                    oc++;
            }
        }
        int[]count={ec,oc};
        return count;
    }
}
