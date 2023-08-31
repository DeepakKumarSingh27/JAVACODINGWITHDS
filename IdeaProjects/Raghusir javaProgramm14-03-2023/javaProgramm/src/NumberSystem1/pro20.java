package NumberSystem1;
import java.util.Scanner;
public class pro20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        if ( n>=9 && n<=99) System.out.println("2 Digit number");
        else System.out.println("not two digit number");
    }
}
