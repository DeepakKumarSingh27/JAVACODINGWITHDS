package OneDArray;
public class Arr5 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[] x=ao.readArray();
        System.out.println("user entered element is ");
        ao.dispArray(x);
        int small=issmall(x);
        System.out.println("smallest element is "+small);
    }

    static int issmall(int[] x)
    {
        int small=x[0];
        for (int i=0;i<x.length;i++)
        {
            if (small>x[i])
                small=x[i];
        }
        return small;
    }
}
