package kunalsirAssignment3;
import java.util.Scanner;
public class Pro7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the power value");
        int p=sc.nextInt();
        int pow=1;
        while (p>0)
        {
            pow*=n;
            p--;
        }
        System.out.println("power of Number is "+pow);
    }
}
