package kunalSirAssignment4;
import java.util.Scanner;
public class Pro12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        boolean rs=isPythagorean(a,b,c);
        if (rs)
            System.out.println("Triplet");
        else
            System.out.println("not triplet");
    }
    static boolean isPythagorean(int a, int b,int c)
    {
      int sur=1;
      sur=(a*a)+(b*b);
      c*=c;
      return sur==c;
    }
}
