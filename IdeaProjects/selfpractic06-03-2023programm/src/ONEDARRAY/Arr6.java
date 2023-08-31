package ONEDARRAY;
public class Arr6 {
    public static void main(String[] args) {
        int[] x=ArrayOperation.readArray();
        System.out.println("user entered element is ");
        ArrayOperation.dispArray(x);
        int sum=findSum(x);
        System.out.println("Biggest Arrays element is "+sum );
    }
    static int findSum(int[] x)
    {
        int sum=0;
        for (int i=0;i<x.length;i++)
        {
            sum=sum+x[i];
        }
        return sum;
    }
}
