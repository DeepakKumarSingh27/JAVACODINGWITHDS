package NumberSystem1;
import java.util.Scanner;
public class pro37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int sum = 0, temp = n;
        do {
            int d = n % 10;
            sum += d*d*d;
            n /= 10;
        }while (n != 0);
        if (temp == sum) System.out.println("Armstrong number");
        else System.out.println("Not Armstrong number");

    }
}
/*
Armstrong number ->
153 ->3*3*3 = 27
    ->5*5*5 = 125;
    -> 1*1*1 = 1
 */