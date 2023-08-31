package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class pro63 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n= sc.nextInt();
        int count=0;
       // for (int i = 1; i <=n ; i++) {
            boolean rs = isSpecial(n);
            if (rs==true) {
              count++;
                System.out.println(rs);
            } else System.out.println(rs);
        }
       // System.out.println(count);
   // }

    public static boolean isSpecial(int n) {
        int sum=0,t=n;
        int d1=n%10;
        int d2=n/10;
        sum=d1+d2+d1*d2;
        return t==sum;
    }
}
