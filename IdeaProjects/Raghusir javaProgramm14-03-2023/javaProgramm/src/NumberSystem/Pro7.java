package NumberSystem;
import java.util.Scanner;
public class Pro7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Money");
        int amt=sc.nextInt();
        System.out.println("Rupees of 500 are "+amt/500);
        amt%=500;
        System.out.println("Rupees of 100 "+amt/100);
        amt%=100;
        System.out.println("Rupees of 10 "+amt/10);
        amt%=10;
    }
}
/*
510->
510->500

1 500 Rupees .
1 10Rupees
 */