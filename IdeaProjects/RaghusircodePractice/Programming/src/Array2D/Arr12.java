package Array2D;
public class Arr12 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.readArray();
        System.out.println("user entered element is ");
        ao.Dispaly(x);
        int[][] rev = rowWiseReverse(x);
        System.out.println("Row wise Reverse is ");
        ao.Dispaly(rev);
    }
    static int[][] rowWiseReverse(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
          int f = 0,l = mat[i].length - 1;
          while (f < l){
              int temp = mat[i][f];
              mat[i][f] = mat[i][l];
              mat[i][l] = temp;
              f++;
              l--;
          }
        }
        return mat;
    }
}
