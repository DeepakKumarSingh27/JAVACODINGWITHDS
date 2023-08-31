package AssignMent7;
public class marheArray {
    public static void main(String[] args) {
        ArrayOpernation ao = new ArrayOpernation();
        System.out.println("Enter first Array");
        int[] x = ao.readArray();
        System.out.println("user entered element is ");
        ao.display(x);
        System.out.println("Enter second Array");
        int[] y = ao.readArray();
        System.out.println("user entered element is ");
        ao.display(y);
        System.out.println("zig zag array is ");
        int[] z = margeArray(x,y);
        ao.display(z);
    }

    public static int[] margeArray(int[] x, int[] y) {
        int[] c = new int[x.length + y.length];
        for (int i = 0; i < x.length; i++) {
            c[i] = x[i];
        }
        for (int i = 0; i < y.length; i++) {
            c[i+x.length] = y[i];
        }
        return c;
    }
}
