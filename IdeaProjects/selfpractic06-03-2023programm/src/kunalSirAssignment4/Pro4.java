package kunalSirAssignment4;
import java.util.Scanner;
public class Pro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = findSum(a, b);
        System.out.println("sum of two Integer number is " + sum);
    }
    static int findSum(int a, int b) {
        int sum=a+b;
        return sum;
    }
}
