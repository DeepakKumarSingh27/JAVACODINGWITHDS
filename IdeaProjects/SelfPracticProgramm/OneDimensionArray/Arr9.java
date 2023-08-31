package OneDimensionArray;
public class Arr9 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[] ar=ao.readArray();
        int count=isCount(ar);
        System.out.println("Number of Prime is "+count);
    }
    static int isCount(int[] ar)
    {
        int count=0;
        for (int i=0;i<ar.length;i++)
        {
            boolean rs=isPrime(ar[i]);
            if (rs==true)
                count++;
        }
        return count;
    }
    static boolean isPrime(int x)
    {
        for (int i=2;i<=x/2;i++)
        {
            if (x%2==0)
                return false;
        }
        return true;
    }
}
