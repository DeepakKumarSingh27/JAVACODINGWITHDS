package Raghusirclasswork.TwoDArray;
public class Arr4 {
    public static void main(String[] args) {
        ArrayOperation aoo = new ArrayOperation();
        int[][] mat= aoo.readArray();
        System.out.println("user entered element is ");
        aoo.disp(mat);
        int small = isSmallest(mat);
        System.out.println("smallest element is "+small);
    }

    public static int isSmallest(int[][] mat) {
        int small = mat[0][0];
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] < small){
                    small=mat[i][j];
                }
            }
        }
        return small;
    }
}
