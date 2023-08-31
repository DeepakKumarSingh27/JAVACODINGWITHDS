package ArrayTwoDimension;
public class Arr15 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.ReadArray();
        System.out.println("user entered Array element is ");
        ao.DisplayArray(x);
        colWiseReverse(x);
        System.out.println("After col wise reverse is ");
        ao.DisplayArray(x);
    }
    public static void colWiseReverse(int[][] mat) {
        for (int i = 0; i < mat[0].length; i++) {
            int first = 0, last = mat.length-1;
            while (first < last) {
                int temp = mat[first][i];
                mat[first][i] = mat[last][i];
                mat[last][i] = temp;
                first++;
                last--;
            }
        }
    }
}
