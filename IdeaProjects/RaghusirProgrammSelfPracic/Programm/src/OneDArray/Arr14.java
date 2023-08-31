package OneDArray;
public class Arr14 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        System.out.println("Enter first Array");
        int[] x=ao.readArray();
        System.out.println("Enter second Array");
        int[] y=ao.readArray();
        System.out.println("user entered element is");
        ao.dispArray(x);
        ao.dispArray(y);
        int[] z=iszigZag(x,y);
        ao.dispArray(z);
    }
    static int[] iszigZag(int[] a, int[] b)
    {
        int[] c=new int[a.length+b.length];
        int i=0,j=0;
        while (i<a.length && i<b.length)
        {
            c[j]=a[i];
            j++;
            c[j]=b[i];
            i++;
            j++;
        }
        while (i<a.length)
        {
            c[j]=a[i];
            j++;
            i++;
        }
        while (i<a.length)
        {
            c[j]=b[i];
            j++;
            i++;
        }
        return c;
    }
}
