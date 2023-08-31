package RaghusirDataStructure.Recursion;
import java.util.Scanner;
public class pro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println(factOfN(n));
    }
    public static int factOfN(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factOfN(n-1);
    }
}
