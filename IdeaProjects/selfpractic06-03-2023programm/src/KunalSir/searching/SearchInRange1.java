package KunalSir.searching;

public class SearchInRange1 {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        System.out.println(linearsearch(arr,3,1,4));
    }
    public static int linearsearch(int arr[],int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int  index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
