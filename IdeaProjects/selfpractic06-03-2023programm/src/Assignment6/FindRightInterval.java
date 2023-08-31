package Assignment6;

import java.util.Arrays;
import java.util.TreeMap;

public class FindRightInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}};
      // int[][] intervals = {{3,4},{2,3},{1,2}};
      //  int[][] intervals = {{1,4},{2,3},{3,4}};
        int[] z = findRightInterval(intervals);
        System.out.println(Arrays.toString(z));
    }

    public static int[] findRightInterval(int[][] intervals) {
        int len = intervals.length;
        if (len == 0) {
            return new int[0];
        }
        if (len == 1) {
            return new int[]{-1};
        }
        int[] ans = new int[len];
        TreeMap<Integer, Integer> sortedmap = new TreeMap<>();
        for (int i = 0; i < len; i++) {
            sortedmap.put(intervals[i][0], i);
        }
        for (int i = 0; i < len; i++) {
            Integer minimumfirstkey = sortedmap.ceilingKey(intervals[i][1]);
            if (minimumfirstkey == null) {
                ans[i] = -1;
            } else {
                ans[i] = sortedmap.get(minimumfirstkey);
            }
        }
        return ans;
    }
}
