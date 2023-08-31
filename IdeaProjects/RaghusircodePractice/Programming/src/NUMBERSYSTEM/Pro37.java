package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int sum=0,temp=n;
        do {
            int d= n%10;
            sum+=d*d*d;
            n/=10;
        }while (n!=0);
        if (sum==temp)
            System.out.println(temp+" is Armstrong Number");
        else
            System.out.println(temp+" is Not Armstrong Number");
    }
}
