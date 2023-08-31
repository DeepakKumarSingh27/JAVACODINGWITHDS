package ONEDARRAY;
public class Arrr12 {
    public static void main(String[] args) {
        int[] x=ArrayOperation.readArray();
        System.out.println("user entered element is");
        ArrayOperation.dispArray(x);
        int[] ct=evenoddsum(x);
        System.out.println("sum of even element in array is "+ct[0]);
        System.out.println("sum of odd element in array is "+ct[1]);
    }
    static int[] evenoddsum(int[] x)
    {
        int esum=0,osum=0;
        for (int i=0;i<x.length;i++)
        {
            if (x[i]%2==0)
            {
                esum+= x[i]; //2,4
            }
            else
            {
            osum += x[i]; //1,3,5
            }
        }
        int[] ct={esum,osum};
        return ct;
    }
}
