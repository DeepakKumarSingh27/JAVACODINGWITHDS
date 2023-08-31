package kunalSirAssignment4;
import java.util.Scanner;
public class Pro1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=Maximum(a,b,c);
        System.out.println("maximum number is "+max);
        int min=Minimum(a,b,c);
        System.out.println("minimum number is "+min);
    }
    private static int Minimum(int a, int b, int c)
    {
      int min=(a<b&&a<c)?a:b<c?b:c;
      return min;
    }

    static int Maximum(int a, int b, int c)
    {
        int max=(a>b&&a>c)?a:b>c?b:c;
        return max;
    }
}
