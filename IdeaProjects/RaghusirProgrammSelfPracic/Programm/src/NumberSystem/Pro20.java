package NumberSystem;
import java.util.Scanner;
public class Pro20 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if (n>=9&&n<=99)
            System.out.println(n+" is Number");
        else
            System.out.println("condition don't match");
    }
}
