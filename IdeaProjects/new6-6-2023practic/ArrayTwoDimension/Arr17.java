package ArrayTwoDimension;
import static ArrayTwoDimension.Arr14.rowWiseReverse;
import static ArrayTwoDimension.Arr7.isTranspose;
public class Arr17 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.ReadArray();
        System.out.println("user entered Array element is ");
        ao.DisplayArray(x);
        System.out.println("After Rotating 90° Left Array is ");
        int[][] y = rotate90Left(x);
        ao.DisplayArray(y);
    }

    public static int[][] rotate90Left(int[][] mat) {
        mat = isTranspose(mat);
        rowWiseReverse(mat);
        return mat;
    }
}
