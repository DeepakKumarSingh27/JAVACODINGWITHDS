package KSirDataStructure.Assignment10;
public class minMax {
    public static void main(String[] args) {
     int[] arr = {1, 4, 45, 6, -50, 10, 2};
     int n = arr.length;
        System.out.println(find(arr,n));
    }
    public static int find(int[] arr, int n) {
      if ( n == 1) {
          return arr[0];
      }
      return Math.max(arr[n-1],find(arr,n-1));//  Math.min(arr[n-1],find(arr,n-1));
    }
}
