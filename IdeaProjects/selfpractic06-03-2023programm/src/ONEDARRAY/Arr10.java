package ONEDARRAY;
public class Arr10 {
    public static void main(String[] args) {
        int[] x=ArrayOperation.readArray();
        System.out.println("user entered element is");
        ArrayOperation.dispArray(x);
        int pc=PrimeCount(x);
        System.out.println("Prime Number present in array is "+pc);
    }
    static int PrimeCount(int[] x)
    {
        int count=0;
        for (int i=0;i<x.length;i++)
        {
            boolean rs=isPrime(x[i]);
            if (rs==true)
            {
                count++;
            }
        }
        return count;
    }
    static boolean isPrime(int x)
    {
        for (int i=2;i<=x/2;i++)
        {
            if (x%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
