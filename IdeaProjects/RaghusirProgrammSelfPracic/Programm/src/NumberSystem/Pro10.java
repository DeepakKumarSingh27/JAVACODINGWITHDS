package NumberSystem;
import java.util.Scanner;
public class Pro10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
       // int n=sc.nextInt();
        int n=sc.nextInt();
        if (n<0)
        {
            System.out.println("Negative");
        } else
        {
            System.out.println("Positive");
        }
    }
}
