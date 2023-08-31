package OneDArray;
public class Arr13 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[] x=ao.readArray();
        System.out.println("user entered array is");
        ao.dispArray(x);
        int[] sum=getSum(x);
        System.out.println("sum of Even Elements are "+sum[0]);
        System.out.println("sum of Odd Elements are "+sum[1]);

    }
    static int[] getSum(int[] ar)
    {
        int esum=0,osum=0;
        for (int i=0;i<ar.length;i++)
        {
            if (ar[i]%2==0)
                esum=esum+ar[i];
            else
                osum=osum+ar[i];
        }
        int[] count={esum,osum};
        return count;
    }
}
