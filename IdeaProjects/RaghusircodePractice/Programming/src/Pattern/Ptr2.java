package Pattern;
import java.util.Scanner;
public class Ptr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
