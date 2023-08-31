package OneDArray;
import java.util.Arrays;
public class Arr11 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[] x=ao.readArray();
        System.out.println("user entered array is ");
        ao.dispArray(x);
        update(x);
        System.out.println(Arrays.toString(x));
    }
    static void update(int[] ar)
    {
        for (int i=0;i<ar.length;i++)
        {
            ar[i]=sumofDigits(ar[i]);
        }
    }
    static int sumofDigits(int n)
    {
        int sum=0;
        while (n!=0)
        {
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        return sum;
    }
}
