package Pattern;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MarsStone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bagSize = scanner.nextInt();
        int commonStonesCount = scanner.nextInt();
        int[] commonStones = new int[commonStonesCount];
        for (int i = 0; i < commonStonesCount; i++) {
            commonStones[i] = scanner.nextInt();
        }

        int maxUniqueStones = maximumUniqueStones(bagSize, commonStonesCount, commonStones);
        System.out.println(maxUniqueStones);

        scanner.close();
    }

    public static int maximumUniqueStones(int bagSize, int commonStonesCount, int[] commonStones) {
        Set<Integer> commonStonesSet = new HashSet<>();
        for (int stone : commonStones) {
            commonStonesSet.add(stone);
        }

        int maxUniqueStones = 0;
        for (int stoneWeight = 2; stoneWeight <= bagSize; stoneWeight++) {
            if (!commonStonesSet.contains(stoneWeight)) {
                maxUniqueStones++;
            }
        }

        return maxUniqueStones;
    }
}





