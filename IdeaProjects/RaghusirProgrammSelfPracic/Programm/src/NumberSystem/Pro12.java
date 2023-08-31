package NumberSystem;
import java.util.Scanner;
public class Pro12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the number");
        int m=sc.nextInt();
        int big=n;
        if (m>big)
            big=m;
            System.out.println(big+" is Biggest");
    }
}
