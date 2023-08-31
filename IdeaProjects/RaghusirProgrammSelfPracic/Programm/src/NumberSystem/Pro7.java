package NumberSystem;
import java.util.Scanner;
public class Pro7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        int amt=sc.nextInt();
        System.out.println("Rupees of 100 is "+amt/100);
        amt%=100;
        System.out.println("Rupees of 50 is "+amt/50);
        amt%=50;
        System.out.println("Rupees of 20 is "+amt/20);
        amt%=20;
        System.out.println("Rupees of 10 is "+amt/10);
        amt%=10;
        System.out.println("Rupees of 5 is "+amt/5);
        amt%=5;
        System.out.println("Rupees of 2 is "+amt/2);
        amt%=2;
        System.out.println("Rupees of 1 is "+amt/1);
        amt%=1;
    }
}
