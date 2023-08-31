package Arrays1Dimension;
public class Arr11 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[] x = ao.ReadArray();
        System.out.println("user entered element is");
        ao.DisplayArray(x);
        int[] sum = isSum(x);
        System.out.println("sum of Array element is ");
        ao.DisplayArray(sum);
    }

    public static int[] isSum(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            int sum = 0;
            do {
                int d = ar[i] % 10;
                sum +=d;
                ar[i]/=10;
            }while (ar[i]!=0);
            ar[i] = sum;
        }
        return ar;
    }
}
