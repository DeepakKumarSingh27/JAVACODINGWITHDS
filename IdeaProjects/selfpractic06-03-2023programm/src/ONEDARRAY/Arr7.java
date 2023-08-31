package ONEDARRAY;
public class Arr7 {
    public static void main(String[] args) {
     int[] x=ArrayOperation.readArray();
        System.out.println("user entered element is");
        ArrayOperation.dispArray(x);
        isReverse(x);
        System.out.println("After Reversing Array is");
        ArrayOperation.dispArray(x);
    }
    static void isReverse(int[] x)
    {
        int i=0,l=x.length-1;
        while (i<l)
        {
            int temp=x[i];
            x[i]=x[l];
            x[l]=temp;
            i++;
            l--;
        }
    }
}
