package ArrayTwoDimension;
public class Arr2 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[][] x= ao.ReadArray();
        System.out.println("user entered array element is ");
        ao.DisplayArray(x);
        int big = isBiggest(x);
        System.out.println("Array Biggest Element is "+big);
    }

    public static int isBiggest(int[][] arr) {
        int big = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
              if (big < arr[i][j]) {
                  big = arr[i][j];
              }
            }
        }
        return big;
    }
}
