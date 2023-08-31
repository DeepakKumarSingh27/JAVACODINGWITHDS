package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class pro55 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        String st = isXylomPholem(n);
        System.out.println(st);
    }

    public static String isXylomPholem(int n) {
        int osum=0,msum=0,t=n;
        do {
            int d = n%10;
            if (t==n || n <10)
                osum += d;
            else
                msum+=d;
            n/=10;
        }while (n!=0);
        if (osum==msum)
            return "xylem";
        else
            return "phloem";
    }
}
