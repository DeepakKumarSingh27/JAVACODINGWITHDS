package NumberSystem;
import java.util.Scanner;
public class Pro54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int ds = digitInNum(n);
        System.out.println("Digits present in number are " + ds);
    }
    static int digitInNum(int n)
    {
        int count=0;
        do {
            int d=n%10;
            count++;
            n=n/10;
        }while (n!=0);
        return count;
    }
}