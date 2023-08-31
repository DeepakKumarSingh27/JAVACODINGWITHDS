package Raghusirclasswork.NumberSystem;
import java.util.Scanner;
public class pro62 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
    int n = sc.nextInt();
    int count =0;
        for (int i = 1; i <=n ; i++) {
            boolean rs = isArmstrong(n);
            if (rs==true){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("====");
        System.out.println(count);

}
    public static boolean isArmstrong(int n) {
        int dc= digitcount(n);
        int sum=0,t=n;
        do {
            int r = n % 10;
            sum += isPower(r,dc);
            n /= 10;
        }while (n !=0);
        return t==sum;
    }

    public static int isPower(int n, int p) {
        int pw = 1;
        while (p> 0){
            pw *= n;
            p--;
        }
        return pw;
    }

    public static int digitcount(int n) {
        double ct = Math.log10(n)+1;
        return (int)ct;
    }
}
