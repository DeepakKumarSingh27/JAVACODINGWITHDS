package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro52 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        boolean rs=isArmstrong(n);
        if (rs==true)
            System.out.println(n+" is Armstrong number");
        else
            System.out.println(n+" is not Armstrong number");
    }
    static boolean isArmstrong(int n)
    {
        int sum=0,temp=n;
        int dc=countDigit(n);
        do {
            int d=n%10;
            sum=sum+power(d,dc);
            n=n/10;
        }while (n!=0);
        return sum==temp;
    }
    static int power(int n, int p)
    {
        int pow=1;
        while (p>0)
        {
          pow=pow*n;
          p--;
        }
        return pow;
    }

    static int countDigit(int n)
    {
        int count=0;
        do {
            count++;
            n=n/10;
        }while (n!=0);
        return count;
    }
}
