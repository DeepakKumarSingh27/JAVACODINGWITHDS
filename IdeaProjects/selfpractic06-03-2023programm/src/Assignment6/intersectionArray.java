package Assignment6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class intersectionArray {
    public static void main(String[] args) {
//       int[] nums1 = {1,2,2,1};
//       int[] nums2 = {2,2};
      int[] nums1 = {4,9,5};
      int[] nums2 = {9,4,9,8,4};
       int[] z= intersection(nums1,nums2);
        System.out.println(Arrays.toString(z));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])){
                ans.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}
