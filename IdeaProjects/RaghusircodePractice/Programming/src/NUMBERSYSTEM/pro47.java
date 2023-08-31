package NUMBERSYSTEM;
import java.util.Scanner;
public class pro47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(sum(n));
    }

    static int sum(int n) {
        int sum=0;
        do {
            int d=n%10;
            sum+=d;
            n/=10;
        }while (n!=0);
        return sum;
    }
}
