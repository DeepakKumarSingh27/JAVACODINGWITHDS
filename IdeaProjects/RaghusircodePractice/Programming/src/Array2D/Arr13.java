package Array2D;
public class Arr13 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.readArray();
        System.out.println("user entered element is ");
        ao.Dispaly(x);
        int[][] rev = columnWiseReverse(x);
        System.out.println("column wise Reverse is ");
        ao.Dispaly(rev);
    }
    static int[][] columnWiseReverse(int[][] mat) {
        for (int i = 0; i < mat[0].length; i++) {
            int f = 0,l = mat[i].length - 1;
            while (f < l){
                int temp = mat[f][i];
                mat[f][i] = mat[l][i];
                mat[l][i] = temp;
                f++;
                l--;
            }
        }
        return mat;
    }
}
