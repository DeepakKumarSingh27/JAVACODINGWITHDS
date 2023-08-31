package kunalsirAssignment3;
import java.util.Scanner;
public class Pro2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = input.nextInt();
        System.out.print("Enter the per-unit rate: ");
        double rate = input.nextDouble();
        double bill = units * rate;
        System.out.println("Electricity bill = " + bill);
    }
}
