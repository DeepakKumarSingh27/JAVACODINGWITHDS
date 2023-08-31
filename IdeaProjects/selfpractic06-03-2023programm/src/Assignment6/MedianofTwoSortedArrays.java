package Assignment6;
import java.util.Arrays;
public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {1};
        double z = findMedianSortedArrays(nums1, nums2);
        System.out.println(z);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int m = nums1.length;
      int n = nums2.length;
      int a[] = new int[m+n];
      int i = 0,j = 0,k = 0;
      while (i < m && j < n) {
          if (nums1[i] < nums2[j]) {
              a[k] = nums1[i];
              i++;
          } else {
              a[k] = nums2[j];
              j++;
          }
          k++;
      }
      while (i < m) {
          a[k] = nums1[i];
          i++;
          k++;
      }
      while (j < n){
          a[k] = nums2[j];
          j++;
          k++;
      }
      if ((m+n) % 2 != 0)
      {
          return a[(m+n)/2];
      }
      else
      {
          int x = (m+n) / 2;
          double p = a[x];
          double q = a[x - 1];
          return (p+q) / 2;
      }
    }
}



/*
int[] z = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            z[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            z[i + nums1.length] = nums2[i];
        }
        Arrays.sort(z);
        double sum = 0;
        if (z.length <= 1){
           return 1.0;
        }
       else if (z.length > 1) {
          double i = z[1];
            double j = z[2];
            if (z.length % 2 == 0) {
                sum = (i + j) / 2;
            } else {
                sum = i;
            }
        }
        return sum;
 */

// for (int i = 0; i < 1; i++) {
//        if (z.length % 2 == 0) {
//        sum += ((i + 1) + (i + 2)) / 2;
//        } else {
//        sum += (i + 1) / 2;
//        }
//        }
//        return sum;
//        for (int i = 0; i < z.length; i++) {
//            if (small > z[i]) {
//                small = z[i];
//            }
//        }
//       // System.out.println(small);
//        double big = z[0];
//        for (int i = 0; i < z.length; i++) {
//            if (big < z[i]) {
//                big = z[i];
//            }
//        }
//     //   System.out.println(big);
//        double sum = (big + small)/2;
//        return sum;
