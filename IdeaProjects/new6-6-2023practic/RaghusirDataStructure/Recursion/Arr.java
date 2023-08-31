package RaghusirDataStructure.Recursion;

public class Arr {
    public static void main(String[] args) {
        int[] arr = {3,48};
        Long x = SubArraySum(arr,arr.length);
        System.out.println(x);
    }
    public static long SubArraySum(int arr[], int n)
    {
        long result = 0, temp = 0;

        for (int i = 0; i < n; i++) {
            temp = 0;
            for (int j = i; j < n; j++) {
                temp += arr[j];
                result += temp;
            }
        }
        return result;
    }
}
