package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class Happy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean rs = isHappy(n);
        if (rs)
            System.out.println("happy");
        else System.out.println("unhappy");
    }

    public static boolean isHappy(int n) {
        while (n >9){
            n=sumofDigits(n);
        }
        return n==1||n==7;
    }

    public static int sumofDigits(int n) {
        int sum=0;
        do {
            int d=n%10;
            sum+=d*d;
            n/=10;
        }while (n!=0);
        return sum;
    }
}
