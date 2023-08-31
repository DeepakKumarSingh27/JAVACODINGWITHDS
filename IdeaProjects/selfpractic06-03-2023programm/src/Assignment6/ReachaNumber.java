package Assignment6;
public class ReachaNumber {
    public static void main(String[] args) {
        int target = 2;
        int z = reachNumber(target);
        System.out.println(z);
    }
    public static int reachNumber(int target) {
        target = Math.abs(target);
        int sum = 0,k = 0;
        while (sum < target) {
            k++;
            sum += k;
        }
        return (sum - target) % 2 == 0 ? k : k % 2 == 0 ? k + 1 : k + 2;

    }
}
