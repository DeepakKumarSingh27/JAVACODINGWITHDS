package OneDArray;
public class Arr7 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[] ar=ao.readArray();
        System.out.println("user entered array is ");
        ao.dispArray(ar);
        int sum=isSum(ar);
        System.out.println("sum of Array Element is "+sum);
    }
    static int isSum(int[] ar)
    {
        int sum=0;
        for (int i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        return sum;
    }
}
