package Pattern;
import java.util.Scanner;
public class Pro31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
