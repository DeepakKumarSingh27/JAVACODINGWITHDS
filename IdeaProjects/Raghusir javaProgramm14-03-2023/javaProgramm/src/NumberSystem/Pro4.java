package NumberSystem;
import java.util.Scanner;
public class Pro4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principle");
        int p=sc.nextInt();
        System.out.println("Enter the time");
        int t=sc.nextInt();
        System.out.println("Enter the Rate of interest");
        int r=sc.nextInt();
        int si=(p*r*t)/100;
        System.out.println("simple Interest is "+si);
    }
}
