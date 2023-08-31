package Raghusirclasswork.TwoDArray;

public class Arr7 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        System.out.println("Enter the first Array");
        int[][] x= ao.readArray();
        System.out.println("user entered values are ");
        ao.disp(x);
        System.out.println("enter second array");
        int[][] y = ao.readArray();
        System.out.println("user entred second element is ");
        ao.disp(y);
        int[][] sum = getSum(x,y);
        System.out.println("Answer are ");
        ao.disp(sum);
    }

    public static int[][] getSum(int[][] x, int[][] y) {
        if (x.length!=y.length||x[0].length!=y[0].length){
            return null;
        }
        int[][] sum=new int[x.length][y.length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                sum[i][j]+=x[i][j]+y[i][j];
            }
        }
        return sum;
    }
}
