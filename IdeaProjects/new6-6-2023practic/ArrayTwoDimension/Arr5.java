package ArrayTwoDimension;

public class Arr5 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x = ao.ReadArray();
        System.out.println("user entered array element is ");
        ao.DisplayArray(x);
        int small = isSmallest(x);
        System.out.println("Array smallest Element is " + small);
    }

    public static int isSmallest(int[][] arr) {
        int small = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < small) {
                    small = arr[i][j];
                }
            }
        }
        return small;
    }
}
