package NumberSystem;
import java.util.Scanner;
public class Pro53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the power");
        int p=sc.nextInt();
        int power=isPower(n,p);
System.out.println(n+" the power "+p+" is "+power);
    }
    static int isPower(int n, int p)
    {
        int pow=1;
        while(p>0)
        {
            pow=pow*n;
            p--;
        }
        return pow;
    }
}
