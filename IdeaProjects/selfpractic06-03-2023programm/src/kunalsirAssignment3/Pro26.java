package kunalsirAssignment3;
import java.util.Scanner;
public class Pro26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nsum=0,psum=0,posum=0;
        while (true)
        {
            System.out.println("Enter the number");
            int n=sc.nextInt();
            if (n<0)
            {
                nsum+=n;
            }
            if (n%2==0)
            {
                psum+=n;
            }
            else {
                posum+=n;
            }
            if (n==0)
            {
                break;
            }
        }
        System.out.println("sum of Negative is "+nsum);
        System.out.println("sum of Positive even  sum is "+psum);
        System.out.println("sum of odd positive is "+posum);
    }
}
