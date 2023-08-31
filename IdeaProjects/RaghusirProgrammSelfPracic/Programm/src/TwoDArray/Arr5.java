package TwoDArray;
public class Arr5 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered element is");
        ao.dispmat(x);
        int count=primeCount(x);
        System.out.println("prime number present in array is "+count);
    }
    static int primeCount(int[][] mat)
    {
        int count=0;
        for (int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[i].length;j++)
            {
                boolean rs=primecount(mat[i][j]);
                if (rs==true)
                    count++;
            }
        }
        return count;
    }
    static boolean primecount(int x)
    {
        for (int i=2;i<=x/2;i++)
        {
            if (x%i==0)
                return false;
        }
        return true;
    }
}
