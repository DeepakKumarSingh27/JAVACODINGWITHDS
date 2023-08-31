package NumberSystem1;
import java.util.Scanner;
public class pro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle");
        int p = sc.nextInt();
        System.out.println("Enter the Rate ");
        int r= sc.nextInt();
        System.out.println("Enter the Time ");
        int t =sc.nextInt();
        int si = (p*r*t)/100;
        System.out.println("simple interest is "+si);
    }
}
