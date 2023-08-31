package NumberSystem;
import java.util.Scanner;
public class Pro17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month Number:");
        int n=sc.nextInt();
        if(n>=1 && n<=12)
            System.out.println("valid");
        else
            System.out.println("invalid");
    }
}
