package NumberSystem1;
import java.util.Scanner;
public class pro32 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (i % 2 == 0) count++; System.out.print(count+" ");
    }
}
