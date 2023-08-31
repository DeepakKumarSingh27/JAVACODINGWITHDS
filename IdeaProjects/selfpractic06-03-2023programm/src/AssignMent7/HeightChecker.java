package AssignMent7;
import java.util.Arrays;
public class HeightChecker {
    public static void main(String[] args) {
       int[] heights = {1,1,4,2,1,3};
       int z = heightChecker(heights);
        System.out.println(z);
    }
    public static int heightChecker(int[] heights) {
     int[] clone =heights.clone();
     int res = 0;
        Arrays.sort(clone);
        for (int i = 0; i < heights.length; i++) {
            if (clone[i] != heights[i]) res++;
        }
        return res;
    }
}
