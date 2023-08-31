package ONEDARRAY;
public class Arr11 {
    public static void main(String[] args) {
        int[] x=ArrayOperation.readArray();
        System.out.println("user entered element is");
        ArrayOperation.dispArray(x);
        int[]sum=ElementRelpaceSum(x);
        ArrayOperation.dispArray(sum);
    }
    static int[] ElementRelpaceSum(int[] x)
    {
        for (int i=0;i<x.length;i++)
        {
            int sum=0;
            do {
                int d=x[i]%10;
                sum=sum+d;
                x[i]/=10;
            }while (x[i]!=0);
            x[i]=sum;
        }
        return x;
    }
}
