package KunalSir.searching;

public class FindMin1 {
    public static void main(String[] args) {
//        int[] arr = {18,12,-7,3,14,28};
//        System.out.println(min(arr));
        int nums = -1211;
        System.out.println(digits(nums));
    }
    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i] ;
        }
        return min;
    }
    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }
}
