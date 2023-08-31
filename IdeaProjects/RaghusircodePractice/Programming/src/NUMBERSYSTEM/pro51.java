package NUMBERSYSTEM;
import java.util.Scanner;
public class pro51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        boolean rs=isStrong(n);
        if (rs==true)
            System.out.println(n+" is strong Number");
        else
            System.out.println(n+" is not Strong");
    }
    static boolean isStrong(int n) {
        int sum=0,temp=n;
        do {
            int d=n%10;
            sum+=isfact(d);
            n/=10;
        }while (n!=0);
        return sum==temp;
    }

    static int isfact(int n) {
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact*=i;
        }
        return fact;
    }
}
