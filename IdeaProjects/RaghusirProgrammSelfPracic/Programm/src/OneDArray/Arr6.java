package OneDArray;
public class Arr6 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[] ar=ao.readArray();
        System.out.println("user Enter Array is ");
        ao.dispArray(ar);
        isReverse(ar);
        System.out.println("Reverse Array is ");
        ao.dispArray(ar);
    }
    static void isReverse(int[] ar)
    {
        int i=0,j=ar.length-1;
        while (i<j)
        {
            int temp=ar[i];
             ar[i]=ar[j];
             ar[j]=ar[i];
            i++;
            j--;
        }
    }
}
