package OneDArray;
import java.util.Arrays;
public class Arr12 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[] x=ao.readArray();
        System.out.println("user entered Array is");
        ao.dispArray(x);
        int[] sum=isgetsum(x);
        System.out.println(Arrays.toString(sum));
        //System.out.println("sum of Array Digit element is "+sum);
    }
    static int[] isgetsum(int[] ar)
    {
        for (int i=0;i<ar.length;i++)
        {
            int sum=0;
            do {
                int d=ar[i]%10;
                sum=sum+d;
                ar[i]=ar[i]/10;
            }while (ar[i]!=0);
            ar[i]=sum;
        }
        return ar;
    }
}
