package NumberSystem;
import java.util.Scanner;
public class Pro50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        countDigit(n);
    }
    static void countDigit(int n) {
        int count=0;
        do {
            count++;
            n/=10;
        }while (n!=0);
        System.out.println(count);
    }
}
