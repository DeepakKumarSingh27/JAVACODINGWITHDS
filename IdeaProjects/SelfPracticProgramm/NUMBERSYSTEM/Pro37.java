package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro37  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int sum=0,temp=n;
        do {
            int d=n%10;
            sum=sum+d*d*d;
            n/=10;
        }while (n!=0);
        if (sum==temp)
            System.out.println(temp+" is Armstrong number");
        else
            System.out.println(temp+" is not armstrong number");

    }
}
