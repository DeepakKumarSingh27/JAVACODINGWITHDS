package Raghusirclasswork.Pattern;
import java.util.Scanner;
public class ptr3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        pattern3(n);
    }
    public static void pattern3(int n) {
        for (int i = n; i >0 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
