package ArrayTwoDimension;
public class Arr3 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x= ao.ReadArray();
        System.out.println("user entered array element is ");
        ao.DisplayArray(x);
        int sum = isSum(x);
        System.out.println("Sum of Array Element is "+sum);
    }

    public static int isSum(int[][] x) {
        int sum =0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                sum += x[i][j];
            }
        }
        return sum;
    }
}
