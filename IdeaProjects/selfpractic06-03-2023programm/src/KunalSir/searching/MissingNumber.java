package KunalSir.searching;
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int ans = missingNumber(nums);
        System.out.println(ans);

    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] <arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
          if (arr[index] !=index){
              return index;
          }
        }
        return arr.length;
    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
