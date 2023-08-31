package kunalsirAssignment3;
import java.util.Scanner;
public class Pro14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        boolean rs=isArmstrong(n);
        if (rs==true)
        {
            System.out.println(n+" is Armstrong");
        }
        else
        {
            System.out.println(n+" is not Armstrong");
        }
    }
    static boolean isArmstrong(int n)
    {
        int sum=0,temp=n;
        do {
            int d=n%10;
            sum=sum+d*d*d;
            n/=10;
        }while (n!=0);
        return sum==temp;
    }
}
