package KunalSir.searching;
public class LinearSearch {
    static  int linearSearch(int[] arr,int target)
    {
        if (arr.length==0){
            return -1;
        }
        for (int index=0;index<arr.length;index++)
        {
            //check for every index
            int element=arr[index];
            if (element==target){
                return index;
            }
        }
        return -1;
    }
    static  int linearSearch2(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element:arr) {
            //check for every index
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // search in the Array
        int nums[] = {23,45,1,2,8,19,-3,16,-11,28};
        int target=19;
        int ans=linearSearch(nums,target);
        System.out.println(ans);

    }
}
