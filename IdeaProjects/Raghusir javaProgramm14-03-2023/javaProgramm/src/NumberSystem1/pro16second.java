package NumberSystem1;
import java.util.Scanner;
public class pro16second {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        if (n<=9) System.out.println("Digit");
        else System.out.println("Number");
    }
}
