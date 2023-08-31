package AssignMent7;
import java.util.Arrays;
public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int[] z = relativeSortArray(arr1,arr2);
        System.out.println(Arrays.toString(z));
    }
    public  static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] z = new int[arr1.length + arr2.length];
        for(int i =0;i < arr1.length; i++) {
            z[i] = arr1[i];
        }
        for(int i =0 ;i< arr2.length; i++){
            if(z[i] == arr2[i]){

            } else {
                z[i + arr2.length] = arr2[i];
            }
        }
        Arrays.sort(z);
        for (int i = 0; i < z.length; i++) {
            if (z[i] != 0){
                return z;
            }
        }
        return z;
    }
}
