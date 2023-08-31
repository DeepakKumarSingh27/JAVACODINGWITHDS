package Array2D;
public class Arr2 {
    public static void main(String[] args) {
        ArrayOperation ao=new ArrayOperation();
        int[][] x=ao.readArray();
        System.out.println("user entered value is ");
        ao.Dispaly(x);
        int big=x[0][0];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j <x[0].length ; j++) {
                if (x[i][j]>big)
                    big=x[i][j];
            }
        }
        System.out.println("Biggest element is "+big);
    }
}
