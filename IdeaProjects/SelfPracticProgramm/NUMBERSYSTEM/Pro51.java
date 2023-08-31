package NUMBERSYSTEM;
import java.util.Scanner;
public class Pro51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the power");
        int p=sc.nextInt();
        int pow=ispower(n,p);
        System.out.println("power of "+n+" is "+pow);
    }
    static int ispower(int n, int p)
    {
        int pow=1;
        while (p>0)
        {
          pow=pow*n;
          p--;
        }
        return pow;
    }
}
