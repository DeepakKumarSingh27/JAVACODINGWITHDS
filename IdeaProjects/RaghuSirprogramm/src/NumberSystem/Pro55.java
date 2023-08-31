package NumberSystem;
import java.util.Scanner;
public class Pro55 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        boolean st=isStrong(n);//145
        /*
        145->
        5!->120
        4!->24
        1!->1
        sum=120+24+1->145;
         */
        if (st)
            System.out.println(n+" is strong number:");
        else
            System.out.println(n+" is not strong number:");
    }
    static boolean isStrong(int n)
    {
        int sum=0,temp=n;
        do {
            int d=n%10;
            sum=sum+getfact(d);
            n=n/10;
        }while (n!=0);
        return sum==temp;
    }
    static int getfact(int d)
    {
        int fact=1;
        for (int i=1;i<=d;i++)
        {
         fact*=i;
        }
        return fact;
    }
}
