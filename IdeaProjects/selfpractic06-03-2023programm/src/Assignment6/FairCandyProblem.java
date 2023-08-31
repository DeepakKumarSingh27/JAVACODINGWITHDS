package Assignment6;
import java.util.Arrays;
import java.util.HashSet;

public class FairCandyProblem {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};
        int[] z = fairCandySwap(aliceSizes,bobSizes);
        System.out.println(Arrays.toString(z));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0,sumB = 0;
        for (int candy : aliceSizes){
            sumA += candy;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int candy : bobSizes){
            set.add(candy);
            sumB += candy;
        }
        int delete = (sumB - sumA) / 2;
        for (int candy : aliceSizes){
            if (set.contains(candy+delete))
                return new int[]{candy,candy+delete};
        }
        return null;
    }
}
