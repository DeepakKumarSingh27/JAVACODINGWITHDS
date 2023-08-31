package Arrays1Dimension;
public class Arr12 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[] x = ao.ReadArray();
        System.out.println("user entered element is ");
        ao.DisplayArray(x);
        int[] sum = getSum(x);
        System.out.println("Even Sum is "+sum[0]);
        System.out.println("Odd sum is "+sum[1]);
    }

    public static int[] getSum(int[] ar) {
        int esum =0,osum =0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) esum += ar[i];
            else  osum += ar[i];
        }
        int[] ct = {esum,osum};
        return ct;
    }
}
