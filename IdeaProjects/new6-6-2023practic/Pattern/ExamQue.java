package Pattern;
import java.util.Scanner;
public class ExamQue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j =1;j<=n-1;j++){
                System.out.print(" ");
            }
            int x = i;
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(x);
                if (j < i)
                    x++;
                else
                    x--;
            }
            System.out.println();
        }
    }
}
