package kunalSirAssignment4;
import java.util.Scanner;
public class Pro7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        boolean rs=isPrime(n);
        if (rs==true)
        {
            System.out.println(n+" is Prime Number");
        }
        else{
            System.out.println(n+" is Not Prime");
        }
    }
    static boolean isPrime(int n) {
        for (int i = 2; i < n/2; i++) {
            if (n%i==0)
            {
                return false;
            }

        }
        return true;
    }
}
