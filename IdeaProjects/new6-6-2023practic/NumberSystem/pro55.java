package NumberSystem;
import java.util.Scanner;
public class pro55 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        boolean rs = xyloemPholeam(n);
        if (rs)
            System.out.println("Xylem");
        else System.out.println("pholeam");
    }

    private static boolean xyloemPholeam(int n) {
        int fs =0,ms =0,temp =n;
        do {
            int d = n%10;
            if (temp == n || n <10)
            fs +=d;
            else
                ms +=d;
            n/=10;
        }while (n!=0);
        if (fs == ms)
            return true;
        else
            return false;
    }
}
