package Pattern;
import java.util.Scanner;
public class Pro30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        for (int i = n; i >0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
