package AssignMent7;
import java.util.Arrays;
public class SortIntegersbyTheNumberof1Bits {
    public static void main(String[] args) {
        int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};
        int[] z = sortByBits(arr);
        System.out.println(Arrays.toString(z));
    }
    public static int[] sortByBits(int[] arr) {
     Integer[] wrappedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
     Arrays.sort(wrappedArr,(a,b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a-b : Integer.bitCount(a) - Integer.bitCount(b));
     return Arrays.stream(wrappedArr).mapToInt(Integer::intValue).toArray();
    }
}
