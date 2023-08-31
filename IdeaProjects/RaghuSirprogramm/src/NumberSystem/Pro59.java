package NumberSystem;
import java.util.Scanner;
public class Pro59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        boolean rs=isHappy(n);
        if (rs)
            System.out.println(n+" is Happy number:");
        else
            System.out.println(n+" is not Happy number:");
    }
    static boolean isHappy(int n)
    {
        while(n>9)
        {
            n=sumOfdigit(n);
        }
        return n==1 ||n==7;
    }
    static int sumOfdigit(int n)
    {
        int sum=0;
        do{
            int d=n%10;
            sum=sum+d*d;
            n=n/10;
        }while (n!=0);
        return sum;
    }
}
