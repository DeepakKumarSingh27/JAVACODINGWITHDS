package NumberSystem;
import java.util.Scanner;
public class Pro51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        boolean rs=isStrong(n);
        if (rs==true)
            System.out.println(n+"is Strong Number");
        else
            System.out.println(n+" is not Strong Number");
    }
    static boolean isStrong(int n) {
     int sum=0,temp=n;
     do {
         int d=n%10;
         sum+=factorial(d);
         n/=10;
     }while (n!=0);
     return temp==sum;
    }
    static int factorial(int d) {
        int fact=1;
        for (int i = 1; i <= d; i++) {
            fact*=i;
        }
        return fact;
    }
}
