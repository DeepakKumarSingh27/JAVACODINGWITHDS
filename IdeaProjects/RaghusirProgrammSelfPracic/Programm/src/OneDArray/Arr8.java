package OneDArray;
public class Arr8 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[] x=ao.readArray();
        System.out.println("user entered array is ");
        ao.dispArray(x);
        int[] ct=isCount(x);
        System.out.println("Even Number are "+ct[0]);
        System.out.println("Odd Number are "+ct[1]);

    }
    static int[] isCount(int[] ar)
    {
        int ec=0,oc=0;
        for (int i=0;i<ar.length;i++)
        {
            if (ar[i]%2==0)
                ec++;
            else
                oc++;
        }
        int[] count={ec,oc};
        return count;

    }
}
