package KunalSir.BinarySearch;
public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target=10;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while (target > arr[end])
        {
            int temp=end+1;
            end=end +(end - start+1)*2;
            start=temp;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int start,int end)
    {
        while (start<=end)
        {
            // find middle element
            // int mid=(start+end)/2;
            int mid=start + (end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target >arr[mid]){
                start=mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
