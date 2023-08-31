package Assignment6;
public class MaximumValueataGivenindexinaBoundedArray {
    public static void main(String[] args) {
       int n = 3;
        int index = 2;
        int maxSum = 18;
        int z = maxValue(n,index,maxSum);
        System.out.println(z);
    }
    public static int maxValue(int n, int index, int maxSum) {
     long r = n - index - 1;
     long l = index;
     long hi = maxSum;
     long lo = 1;
     long res = 0;
     while (lo <= hi) {
         long mid = (hi - lo) / 2 + lo;
         long sum = mid;
         long ls = 0;
         long rs = 0;
         long m = mid - 1;
         if (r <= m)
             rs = m * (m + 1) / 2 - (m - r)*(m - r + 1) / 2;
         else
             rs = m * (m + 1) / 2 + 1 * (r - m);
         if (l <= m)
            ls = m * (m + 1) / 2 - (m - l) * (m - l + 1) / 2;
         else
          ls = m * (m + 1) / 2 + 1 * (l - m);
         sum += ls + rs;
         if (sum <= maxSum) {
             res = mid;
             lo = mid + 1;
         }else {
             hi = mid - 1;
         }
     }
     return (int) res;
    }
}
