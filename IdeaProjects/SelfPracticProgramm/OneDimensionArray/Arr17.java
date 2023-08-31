package OneDimensionArray;
import java.util.Arrays;
public class Arr17 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[] x=ao.readArray();
        System.out.println("user entered array is ");
        ao.disp(x);
       sumArrayEle(x);
        System.out.println("sum of Array element is "+ Arrays.toString(x));
    }
    static void sumArrayEle(int[] ar)
    {
        for (int i=0;i<ar.length;i++)
        {
            ar[i]=sumof(ar[i]);
        }
    }
    static int sumof(int n)
    {
        int sum=0;
        while (n!=0)
        {
            sum=sum+n%10;
            n/=10;
        }
        return sum;
    }
}
