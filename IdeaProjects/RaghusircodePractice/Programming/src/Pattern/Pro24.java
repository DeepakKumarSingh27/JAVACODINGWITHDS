package Pattern;
import java.util.Scanner;
public class Pro24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                for (int k = 1; k <=n-i ; k++) {
                    System.out.print(" ");
                }
                System.out.print(j+" ");
                if (j<i)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
