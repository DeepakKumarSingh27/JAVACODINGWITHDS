package ONEDARRAY;
public class Arr14 {
    public static void main(String[] args) {
        System.out.println("Enter first Array");
        int[] x = ArrayOperation.readArray();
        System.out.println("Enter second Array");
        int[] y = ArrayOperation.readArray();
        System.out.println("user entered element is");
        ArrayOperation.dispArray(x);
        ArrayOperation.dispArray(y);
        int[] z = margeTwoSortedArr(x, y);
        System.out.println("Zigzag Array is");
        ArrayOperation.dispArray(z);
    }
    static int[] margeTwoSortedArr(int[] x, int[] y)
    {
    int[] z=new int[x.length+y.length];
    return z;
    }
}
