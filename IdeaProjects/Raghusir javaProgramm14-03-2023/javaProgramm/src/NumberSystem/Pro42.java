package NumberSystem;
import java.util.Scanner;
public class Pro42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int pro=0;
        do {
            int d = n % 10;
            pro = pro * 10 + d;
            n /= 10;
        }while (n!=0);
        System.out.println("Reverse the nUmber "+pro);
    }
}
