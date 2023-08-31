package Array2D;
public class Arr7 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.readArray();
        System.out.println("user entered element is ");
        ao.Dispaly(x);
        int[] z = isCount(x);
        System.out.println("Even Number in Array is "+z[0]);
        System.out.println("Odd Number in Array is "+z[1]);
    }
    static int[] isCount(int[][] mat) {
        int ec = 0,oc = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] % 2 == 0){
                    ec++;
                } else {
                    oc++;
                }
            }
        }
        int[] count = {ec,oc};
        return count;
    }
}
