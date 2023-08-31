package NumberSystem;
import java.util.Scanner;
public class Pro67 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        boolean rs=isHappy(n);
        if (rs==true)
            System.out.println(n+" is Happy");
        else
            System.out.println(n+" is UnHappy");
    }
    static boolean isHappy(int n)
    {
        while (n>9)
        {
            n=sumofDigits(n);
        }
        return n==1||n==7;
    }
    static int sumofDigits(int n)
    {
        int sum=0;
        do {
            int d=n%10;
            sum=sum+d*d;
            n=n/10;
        }while (n!=0);
        return sum;
    }
}
