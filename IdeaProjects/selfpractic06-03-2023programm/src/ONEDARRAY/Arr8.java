package ONEDARRAY;
public class Arr8 {
    public static void main(String[] args) {
    int[] x=ArrayOperation.readArray();
        System.out.println("user entered element is");
        ArrayOperation.dispArray(x);
        int[] count=countEvenOdd(x);
        System.out.println("Even Array element is "+count[0]);
        System.out.println("Odd Array element is "+count[1]);
    }
    static int[] countEvenOdd(int[] x)
    {
        int ecount=0,ocount=0;
        for (int i=0;i<x.length;i++)
        {
            if (x[i]%2==0)
            {
                ecount++;
            }
            else
            {
                ocount++;
            }
        }
        int[] count={ecount,ocount};
        return count;
    }
}
