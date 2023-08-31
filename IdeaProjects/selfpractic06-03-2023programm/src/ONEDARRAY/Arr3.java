package ONEDARRAY;
public class Arr3 {
    public static void main(String[] args) {
     int[] x=ArrayOperation.readArray();
        System.out.println("user entered element is ");
        ArrayOperation.dispArray(x);
        int big=x[0];
        for (int i=1;i<x.length;i++)
        {
            if (x[i]>big)
            {
                big=x[i];
            }
        }
        System.out.println("Biggest Arrays element is "+big);
    }
}
