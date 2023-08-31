package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class pro61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three digits number");
        int n = sc.nextInt();
        for (int i = 100; i <= 999; i++) {
            boolean rs = ispelindrome(i);
            if (rs)
                System.out.println(i + " ");
        }
    }

    public static boolean ispelindrome(int n) {
        int sum=0,t=n;
        do {
            int d= n%10;
            sum=sum*10+d;
            n/=10;
        }while (n!=0);
        return sum==t;
    }
}