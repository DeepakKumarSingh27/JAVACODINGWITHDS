package NumberSystem;
import java.util.Scanner;
public class Pro47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int sum=isSum(n);
        System.out.println(sum);
    }
    static int isSum(int n) {
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }
}
