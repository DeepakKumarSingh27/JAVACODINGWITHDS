package INter;

import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5}; // 1 2 3 5

        int x = missingNumber(arr);
        System.out.println(x);
    }
    public static int missingNumber(int[] arr){
       Arrays.sort(arr); // 1,2,3,4,5;
                         // 0 1 2 3 4
        for (int i = arr.length-2; i>=arr.length-2  ;) {
            return arr[i];
        }
        return 0;
    }
}
