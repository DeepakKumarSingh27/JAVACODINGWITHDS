package TwoDArray;
public class Arr15 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered element");
        ao.dispmat(x);
        rowWiseReverse(x);
        System.out.println("After Row Reversing ");
        ao.dispmat(x);
    }
    static void rowWiseReverse(int[][] mat)
    {
        for (int i=0;i<mat.length;i++)
        {
            int f=0,l=mat[i].length-1;
            while (f<l)
            {
                int temp=mat[i][f];
                mat[i][f]=mat[i][l];
                mat[i][l]=temp;
                f++;
                l--;
            }
        }
    }
}
