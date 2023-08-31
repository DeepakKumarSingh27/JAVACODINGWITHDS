package TwoDArray;
public class Arr19 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.readArray();
        System.out.println("user entered element is");
        ao.dispmat(x);
        DiagonalWiseReverse(x);
        System.out.println("Diagonal wise Reverse is");
        ao.dispmat(x);
    }
    static void DiagonalWiseReverse(int[][] mat)
    {
        for (int i=0;i<mat.length/2;i++)
        {
            int temp=mat[i][i];
            mat[i][i]=mat[mat.length-1-i][mat.length-1-i];
            mat[mat.length-1-i][mat.length-1-i]=temp;
            int temp1=mat[i][mat.length-i-1];
            mat[i][mat.length-i-1]=mat[mat.length-1-i][i];
            mat[mat.length-1-i][i]=temp1;
        }
    }
}
