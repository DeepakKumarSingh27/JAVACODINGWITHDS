package NumberSystem;
import java.util.Scanner;
public class Pro46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=sumOfDigit(n);
        System.out.println("Sum ofDigit is "+sum);
    }
    static int sumOfDigit(int n)
    {
        int sum=0;
        do {
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }while (n!=0);
        return sum;
    }
}
