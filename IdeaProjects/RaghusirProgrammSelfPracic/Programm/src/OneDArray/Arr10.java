package OneDArray;
public class Arr10 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[] x=ao.readArray();
        System.out.println("user entered array is ");
        ao.dispArray(x);
        int count=primeCount(x);
        System.out.println("Prime Number Present in Array is "+count);
    }
    static int primeCount(int[] x)
    {
        int count=0;
        for (int i=0;i<x.length;i++) // 1 2 3 4 5
        {
            boolean rs=isPrime(x[i]);
            if (rs==true)
                count++;
        }
        return count;
    }
    static boolean isPrime(int x)
    {
        for (int j=2;j<=x/2;j++)
        {
            if (x%j==0)
                return false;
        }
        return true;
    }
}
