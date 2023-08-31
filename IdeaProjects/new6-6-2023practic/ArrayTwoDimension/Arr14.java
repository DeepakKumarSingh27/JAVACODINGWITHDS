package ArrayTwoDimension;
public class Arr14 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.ReadArray();
        System.out.println("user entered Array element is ");
        ao.DisplayArray(x);
        rowWiseReverse(x);
        System.out.println("After row wise reversing ");
        ao.DisplayArray(x);
    }
    public static void rowWiseReverse(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int first = 0, last = mat[i].length-1;
            while (first < last) {
                int temp = mat[i][first];
                mat[i][first] = mat[i][last];
                mat[i][last] = temp;
                first++;
                last--;
            }
        }
    }
}