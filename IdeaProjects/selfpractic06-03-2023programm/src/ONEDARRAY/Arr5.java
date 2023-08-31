package ONEDARRAY;

public class Arr5 {
    public static void main(String[] args) {
        int[] x=ArrayOperation.readArray();
        System.out.println("user entered element is ");
        ArrayOperation.dispArray(x);
        int small=findSmallest(x);
        System.out.println("Biggest Arrays element is "+small );
    }
    static int findSmallest(int[] x)
    {
        int small=x[0];
        for (int i=1;i<x.length;i++)
        {
            if (x[i]<small)
            {
                small=x[i];
            }
        }
        return small;
    }
    }
