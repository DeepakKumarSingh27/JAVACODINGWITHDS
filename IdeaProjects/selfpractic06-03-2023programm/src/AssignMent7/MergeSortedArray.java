package AssignMent7;
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m =13;
        int n = 0;
        int[] nums2 = {2,5,6};
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int ct = 0;
      int[] z = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            z[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            z[i + nums1.length] = nums2[i];
        }
        int[] x = new int[ct];
        int j =0;
        for (int i = 0; i < z.length; i++) {
            if (z[i] == 0){

            } else {
                ct++;
               z[j]++;
            }
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(i+" ");
        }
    }
}
/*
int p1 = m - 1, p2 = n - 1, i = m + n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--];
            } else {
                nums1[i--] = nums2[p2--];
            }
        }
 */