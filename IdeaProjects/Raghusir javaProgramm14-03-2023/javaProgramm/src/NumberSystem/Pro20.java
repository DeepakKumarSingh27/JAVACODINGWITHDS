package NumberSystem;
import java.util.Scanner;
public class Pro20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        if (n>9)
            System.out.println("2 Digit Number");
        else
            System.out.println("not 2 digit number");
    }
}
