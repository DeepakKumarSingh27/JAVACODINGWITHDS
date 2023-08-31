package Raghusirclasswork.TwoDArray;

public class Arr8 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] mat = ao.readArray();
        System.out.println("user entered element is ");
        ao.disp(mat);
        int[] ct= countEvenOdd(mat);
        System.out.println("Even is "+ct[0]);
        System.out.println("Odd is "+ct[1]);
    }

    public static int[] countEvenOdd(int[][] mat) {
        int ec=0,oc=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j]%2==0){
                    ec++;
                } else {
                    oc++;
                }
            }
        }
        int[] ct={ec,oc};
        return ct;
    }
}
