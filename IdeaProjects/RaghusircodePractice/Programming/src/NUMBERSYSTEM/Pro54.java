package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        boolean rs= isArmstrong(n);
        if (rs==true)
            System.out.println(n+" is Diserium");
        else
            System.out.println(n+" is not Diserium");
    }
    static boolean isArmstrong(int n) {
        int sum=0,temp=n;
        int dc=count(n);
        do {
            int d=n%10;

            sum=sum+isPower(d,dc);
            dc--;
            n/=10;
        }while (n!=0);
        return sum==temp;
    }

    static int isPower(int n,int p) {
        int pro=1;
        while (p>0){
            pro*=n;
            p--;
        }
        return pro;
    }

    static int count(int n) {
        int count=0;
        do {
            count++;
            n/=10;
        }while (n!=0);
        return count;
    }
}
