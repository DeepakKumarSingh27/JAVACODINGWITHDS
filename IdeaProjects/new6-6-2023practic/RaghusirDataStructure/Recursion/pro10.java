package RaghusirDataStructure.Recursion;
import java.util.Scanner;
public class pro10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }

    public static int sumOfDigits(int n) {
        if (n == 0){
            return n;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
