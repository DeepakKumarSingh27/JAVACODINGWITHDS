package NumberSystem;
import java.util.Scanner;
public class Pro41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int esum=0,osum=0;
        do {
            int d=n%10;
            if (d%2==0)
                esum=esum+d;
            else
                osum=osum+d;
            n=n/10;
        }while (n!=0);
        System.out.println("sum of even Digit is "+esum);
        System.out.println("sum of odd Digit is "+osum);
    }
}
