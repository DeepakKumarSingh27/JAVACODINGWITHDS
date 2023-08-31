package Arrays1Dimension;
public class Arr9 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        System.out.println("First Array is ");
        int[] x = ao.ReadArray();
        System.out.println("Second Array is");
        int[] y = ao.ReadArray();
        int[] z =margeArray(x,y);
        System.out.println("Merged Array is ");
        ao.DisplayArray(z);
    }

    public static int[] margeArray(int[] x, int[] y) {
        int[] marge = new int[x.length + y.length];
        for (int i = 0; i < x.length; i++) {
            marge[i] = x[i];
        }
        for (int i = 0; i < y.length; i++) {
            marge[x.length + i] = y[i];
        }
        return marge;
    }
}
