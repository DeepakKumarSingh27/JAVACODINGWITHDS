package OneDArray;
public class Arr24 {
    public static void main(String[] args) {
        System.out.println("Enter first Array");
        ArrayOperation ao=new ArrayOperation();
        int[] x=ao.readArray();
        System.out.println("Enter second Array");
        int[] y=ao.readArray();
        System.out.println("user entered element");
        ao.dispArray(x);
        ao.dispArray(y);
        int[] z=intersection(x,y);
        System.out.println("common element is ");
        for (int i=0;i<z.length;i++)
        {
            System.out.print(z[i]+" ");
        }
    }
    static int[] intersection(int[] x, int[] y)
    {
        int[] z= new int[x.length];
        int k=0;
        for (int i=0;i<x.length;i++)
        {
            for (int j = 0; j < y.length; j++)
            {
                if (x[i] == y[j])
                {
                    z[k] = x[i];
                    k++;
                    break;
                }
            }
        }
        int[] rs=new int[k];
        for (int i=0;i<k;i++)
        {
            rs[i]=z[i];
        }
        return rs;
    }
}
