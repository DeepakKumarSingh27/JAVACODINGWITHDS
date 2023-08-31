package OneDimensionArray;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class Arr10 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[]x=ao.readArray();
        System.out.println("original Element is ");
        ao.disp(x);
        int[]y=getSum(x);
        System.out.println("sum of Element is ");
        System.out.println(Arrays.toString(y));
    }
    static int[] getSum(int[] ar)
    {
        for (int i=0;i<ar.length;i++)
        {
            int sum=0;
            do{
                int d=ar[i]%10;
                sum=sum+d;
                ar[i]/=10;
            }while (ar[i]!=0);
            ar[i]=sum;
        }
        return ar;
    }
}
