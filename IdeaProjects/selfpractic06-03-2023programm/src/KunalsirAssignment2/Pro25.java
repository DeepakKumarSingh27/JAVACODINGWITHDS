package KunalsirAssignment2;
import java.util.Scanner;
public class Pro25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int big=0;
        while (true)
        {
            System.out.println("Enter the Number");
            int n=sc.nextInt();
            if (n>big)
            {
                big=n;
            }
            if (n==0)
            {
                break;
            }
        }
        System.out.println("Biggest Number is "+big);
    }
}
