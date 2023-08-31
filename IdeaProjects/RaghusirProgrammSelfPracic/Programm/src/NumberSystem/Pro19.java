package NumberSystem;
import java.util.Scanner;
public class Pro19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 Integer Number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int small=(a<b&&a<c)?a:b<c?b:c;
        System.out.println("smallest Number is "+small);
    }
}
