package TwoDArray;
public class Arr16 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered element");
        ao.dispmat(x);
        columnWiseReverse(x);
        System.out.println("After column Reversing ");
        ao.dispmat(x);
    }
    static void columnWiseReverse(int[][] mat)
    {
        for (int i=0;i<mat[0].length;i++)
        {
            int f=0,l=mat.length-1;
            while (f<l)
            {
                int temp=mat[f][i];
                mat[f][i]=mat[l][i];
                mat[l][i]=temp;
                f++;
                l--;
            }
        }
    }
}
