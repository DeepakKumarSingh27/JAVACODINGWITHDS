package AssignMent7;
import java.util.Arrays;
public class AssignCookies {
    public static void main(String[] args) {
       int[] g = {1,2,3};
        int[] s = {1,1};
        int z = findContentChildren(g,s);
        System.out.println(z);
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int i = 0;
        int j = 0;
        while (i <g.length && j < s.length) {
           if (s[j] >= g[i]) {
               result++;
               j++;
               i++;
           } else {
               j++;
           }
        }
        return result;
    }
}
