package OneDimensionArray;
public class Arr8 {
    public static void main(String[] args) {
       ArrayOperation ao=new ArrayOperation();
       int[] ar= ao.readArray();
       int[]count=evenoddcount(ar);
        System.out.println("Even digit is "+count[0]);
        System.out.println("Odd digit is "+count[1]);
    }
    static int[] evenoddcount(int[] ar)
    {
        int ed=0,od=0;
        for (int i=0;i<ar.length;i++)
        {
            if (ar[i]%2==0)
            {
                ed++;
            }
            else
            {
                od++;
            }
        }
        int[] count={ed,od};
        return count;
    }
}
