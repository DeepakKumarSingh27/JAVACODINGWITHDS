package KSirDataStructure.BinarySearch;
import java.util.Arrays;
public class MissingNumber {
    public static void main(String[] args) {
     int[] arr = {0,1,2,4};
        System.out.println(sort(arr));
      //  System.out.println(Arrays.toString(arr));
    }
    public static int sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr,i,correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (j == arr[j]) {
                return j;
            }
        }
        return arr.length;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
