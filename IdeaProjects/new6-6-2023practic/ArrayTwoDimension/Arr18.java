package ArrayTwoDimension;

import static ArrayTwoDimension.Arr7.isTranspose;
import static ArrayTwoDimension.Arr15.colWiseReverse;
public class Arr18 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.ReadArray();
        System.out.println("user entered Array element is ");
        ao.DisplayArray(x);
        System.out.println("After Rotating 90° Right Array is ");
        int[][] y = rotate90Right(x);
        ao.DisplayArray(y);
    }

    public static int[][] rotate90Right(int[][] mat) {
        mat = isTranspose(mat);
        colWiseReverse(mat);
        return mat;
    }
}
