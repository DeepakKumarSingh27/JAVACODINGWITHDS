package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class pro52 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base");
        int n = sc.nextInt();
        System.out.println("Enter the power");
        int p = sc.nextInt();
        ispower(n,p);
    }

    public static void ispower(int n, int p) {
        int pw=1;
        while (p>0)
        {
            pw*=n;
            p--;
        }
        System.out.println(pw);
    }
}
