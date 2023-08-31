package KSirDataStructure.Assignment10;

public class getTriangle {
    public static void main(String[] args) {
        long[] arr = {5, 8, 1, 2, 4, 3, 14};
        //  System.out.println(Arrays.toString(aftersum(arr)));
        aftersum2(arr);
    }
    public static long[] getTriangle(long arr[],long n) {
        if (arr.length == 1) {
            return arr;
        }
        long[] ans = new  long[arr.length-1];
        for (int i = 1; i <= arr.length-1 ; i++) {
            ans[i-1] = arr[i-1] + arr[i];
        }
        return   getTriangle(ans,n);
    }
    public static void aftersum2(long[] arr){
        if (arr.length == 1) {
            return;
        }
        long[] ans = new  long[arr.length-1];

        for (int i = 1; i <= arr.length-1 ; i++) {
            ans[i-1] = arr[i-1] + arr[i];
        }
        aftersum2(ans);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
