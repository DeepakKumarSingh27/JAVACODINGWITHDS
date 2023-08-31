package KunalsirAssignment5;
import java.util.Arrays;
public class Arr8 {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4,0};
       int[] index = {0,1,2,3,0};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[index.length];
        for (int i = 0; i < index.length; i++) {
            for (int j = i; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}
