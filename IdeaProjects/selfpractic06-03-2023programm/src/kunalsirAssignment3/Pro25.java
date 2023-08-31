package kunalsirAssignment3;
public class Pro25 {
    public static void main(String[] args) {
        int daysInAugust = 31; // August has 31 days
        int count = 0; // Counter for even days
        for (int day = 2; day <= daysInAugust; day += 2) {
            count++; // Increment the counter for even days
        }
        System.out.println("Kunal can go out on " + count + " days in August.");
    }
}
