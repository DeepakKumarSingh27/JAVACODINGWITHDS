package TwoDArray;
public class Arr1 {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("number of rows "+mat.length);//3
        System.out.println("number of column "+mat[0].length);//3
        for (int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[i].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
